package com.eight.dao.impl;

import com.eight.bean.book_detail;
import com.eight.bean.product_info;
import com.eight.dao.BaseDao;
import com.eight.dao.IViewDao;
import com.eight.utils.SqlUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ViewDaoImpl extends BaseDao implements IViewDao{
    @Override
    public String ViewPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pointPage=request.getParameter("pageName");
        Class clazz=null;
        try {
            StringBuffer tb_name_detail;
            int category_id;

            if(pointPage.equals("phone")){
                tb_name_detail=new StringBuffer("phone_detail");
                category_id=1;
            }
            else if(pointPage.equals("book")){
                tb_name_detail=new StringBuffer("book_detail");
                category_id=2;
            }
            else{
                tb_name_detail=new StringBuffer("hourse_app_detail");
                category_id=3;
            }

            clazz=Class.forName("com.eight.bean."+tb_name_detail);
            if(clazz==null)
                System.out.println("NULL");
            SqlUtils sqlUtils_info=new SqlUtils("product_info");
            SqlUtils sqlUtils_detail=new SqlUtils(tb_name_detail.toString());
            sqlUtils_info.Add("one_category_id="+Integer.toString(category_id));
            System.out.println(sqlUtils_info.getSql());
            System.out.println(sqlUtils_detail.getSql());
            List<product_info> list = queryForList(sqlUtils_info.getSql(),product_info.class);
            List<book_detail> detailList = queryForList(sqlUtils_detail.getSql(),clazz);
//        request.setAttribute("List",list);
//        request.setAttribute("detailList",detailList);
            System.out.println(list.size());
            System.out.println(detailList.size());
            return "redirect:" + "/webpage/commodityPage/"+pointPage+".jsp";
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
