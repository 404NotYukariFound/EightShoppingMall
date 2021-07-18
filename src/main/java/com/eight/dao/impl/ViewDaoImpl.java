package com.eight.dao.impl;

import com.eight.bean.book_detail;
import com.eight.bean.product_category;
import com.eight.bean.product_info;
import com.eight.bean.product_pic_info;
import com.eight.dao.BaseDao;
import com.eight.dao.IViewDao;
import com.eight.utils.SqlUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ViewDaoImpl extends BaseDao implements IViewDao {
    @Override
    public String ViewPage(HttpSession session, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pointPage = request.getParameter("pageName");
        try {
            StringBuffer tb_name_detail;
            int category_id;
            if (pointPage.equals("phone")) {
                tb_name_detail = new StringBuffer("phone_detail");
                category_id = 1;
            } else if (pointPage.equals("book")) {
                tb_name_detail = new StringBuffer("book_detail");
                category_id = 2;
            } else {
                tb_name_detail = new StringBuffer("hourse_app_detail");
                category_id = 3;
            }

            Class clazz = Class.forName("com.eight.bean." + tb_name_detail);

            SqlUtils sqlUtils_picInfo = new SqlUtils("product_pic_info");
            SqlUtils sqlUtils_category = new SqlUtils("product_category");
            SqlUtils sqlUtils_info = new SqlUtils("product_info");
            SqlUtils sqlUtils_detail = new SqlUtils(tb_name_detail.toString());

            sqlUtils_category.Add("parent_id=" + category_id);
            sqlUtils_info.Add("one_category_id=" + Integer.toString(category_id));

            List<product_category> categoryList = queryForList(sqlUtils_category.getSql(), product_category.class);
            List<product_info> list = queryForList(sqlUtils_info.getSql(), product_info.class);
            List<Class> detailList = queryForList(sqlUtils_detail.getSql(), clazz);

            sqlUtils_picInfo.Add("product_id>="+list.get(0).getProduct_id().toString());
            List<product_pic_info> picInfoList = queryForList(sqlUtils_picInfo.getSql(), product_pic_info.class);

            session.setAttribute(pointPage + "CategoryList", categoryList);
            session.setAttribute(pointPage + "InfoList", list);
            session.setAttribute(pointPage + "DetailList", detailList);
            session.setAttribute(pointPage + "PicInfoList", picInfoList);

            return "redirect:/" + pointPage + ".jsp";
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
