package com.eight.dao.impl;

import com.eight.bean.ViewInfo;
import com.eight.dao.BaseDao;
import com.eight.dao.IRedirectPageDao;
import com.eight.utils.SqlUtils;

import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RedirectPageDaoImpl extends BaseDao implements IRedirectPageDao {
    private StringBuffer tb_name;
    private StringBuffer detail_name;
    private String pageSize;
    private String categoryId;
    private SqlUtils sqlUtils;
    private HttpServletResponse response;
    private String classPath;

    public RedirectPageDaoImpl(String tb_name, String categoryId, String pageSize, HttpServletResponse response, String classPath, String detail_name) {
        this.tb_name = new StringBuffer(tb_name);
        this.detail_name = new StringBuffer(detail_name);
        this.pageSize = pageSize;
        this.categoryId = categoryId;
        this.response = response;
        this.classPath = classPath;
        sqlUtils = new SqlUtils(tb_name, categoryId, pageSize);
    }

    @Override
    public List<ViewInfo> RedirectPage(String curPage, Map<String, String> conList) {
        if (!classPath.equals("")) {
            SqlUtils detailSql = new SqlUtils(detail_name.toString(), pageSize);
            for (Map.Entry<String, String> entry : conList.entrySet()
            ) {
                detailSql.Add("("+entry.getKey() + "=" + entry.getValue()+")");
            }
//        sqlUtils.Limit(curPage);

            detailSql.Limit(curPage,"productCore");
            try {
                Class clazz = Class.forName(classPath);
                List<Class> detailList = queryForList(detailSql.getSql(), clazz);
                Method method = clazz.getMethod("getProductCore");
                List<ViewInfo> viewInfoList = queryForList(sqlUtils.getSql(), ViewInfo.class);
                List<ViewInfo> tmpList = new ArrayList<>();

                for (int i = 0, j = 0; j < detailList.size(); i++) {
                    if (viewInfoList.get(i).getProductCore().equals(method.invoke(detailList.get(j)))) {
                        tmpList.add(viewInfoList.get(i));
                        j++;
                    }
                }
                String str = detailSql.getSql().replace("ORDER BY", "#");
                str=str.replace("WHERE", "@");
                String str_sub = str.substring(str.indexOf("@")+1, str.indexOf("#"));
                long totalRecord = (long) queryForSingleValue("SELECT COUNT(*) FROM " + detail_name + " WHERE " + str_sub + ";");
                if(tmpList.size()>=0){
                    tmpList.get(0).setTotalRecord(totalRecord);
                }

                return tmpList;
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            return null;
        } else{
            sqlUtils.Limit(curPage,"productId");
            return queryForList(sqlUtils.getSql(), ViewInfo.class);
        }
    }
}
