package com.eight.dao.impl;

import com.eight.bean.*;
import com.eight.dao.BaseDao;
import com.eight.dao.IViewDao;
import com.eight.utils.SqlUtils;
import com.google.gson.GsonBuilder;

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
            StringBuffer beanName;
            int categoryId;
            if (pointPage.equals("phone")) {
                tb_name_detail = new StringBuffer("phone_detail");
                beanName=new StringBuffer("PhoneDetail");
                categoryId = 1;
            } else if (pointPage.equals("book")) {
                tb_name_detail = new StringBuffer("book_detail");
                beanName=new StringBuffer("BookDetail");
                categoryId = 2;
            } else {
                tb_name_detail = new StringBuffer("hourse_app_detail");
                beanName=new StringBuffer("HourseAppDetail");
                categoryId = 3;
            }

            Class clazz = Class.forName("com.eight.bean." + beanName);

            SqlUtils sqlUtils_category = new SqlUtils("product_category");
            SqlUtils sqlUtils_detail = new SqlUtils(tb_name_detail.toString());

            sqlUtils_category.Add("parentId=" + categoryId);

            List<ProductCategory> categoryList = queryForList(sqlUtils_category.getSql(), ProductCategory.class);
            List<Class> detailList = queryForList(sqlUtils_detail.getSql(), clazz);

            long totalRecord=(long)queryForSingleValue("SELECT COUNT(*) FROM product_info WHERE oneCategoryId="+categoryId+";");

            session.setAttribute("totalRecord",(int)totalRecord);
            session.setAttribute("pageName",pointPage);
            session.setAttribute(pointPage + "CategoryList", categoryList);
            session.setAttribute(pointPage + "DetailList", detailList);
            return "redirect:/" + pointPage + ".jsp";
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
