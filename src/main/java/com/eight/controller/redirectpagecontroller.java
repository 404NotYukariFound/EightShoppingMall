package com.eight.controller;

import com.eight.bean.ViewInfo;
import com.eight.dao.IRedirectPageDao;
import com.eight.dao.impl.RedirectPageDaoImpl;
import com.eight.mvc.annotation.Controller;
import com.eight.mvc.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class redirectpagecontroller {
    IRedirectPageDao redirectPageDao;

    @RequestMapping("redirectPage.do")
    public List<ViewInfo> RedirectPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String one_category_id;
        String pageName = request.getParameter("pageName");
        String pageSize = request.getParameter("pageSize");
        String curPage = request.getParameter("curPage");
        StringBuffer detail_name;
        int conLen = Integer.parseInt(request.getParameter("conLen"));
        StringBuffer classPath = new StringBuffer("com.eight.bean.");
        Map<String, String> conList = new HashMap<String, String>();

        for (int i = 0; i < conLen; i++) {
            String tmpCon = request.getParameter("condition_" + i);
            String tmpKey = tmpCon.substring(0, tmpCon.indexOf('_'));
            String tmpValue = tmpCon.substring(tmpCon.indexOf('_') + 1, tmpCon.length());
            if (!conList.containsKey(tmpKey)) {
                conList.put(tmpKey, "'" + tmpValue + "'");
            } else {
                conList.put(tmpKey, conList.get(tmpKey) + " OR "+tmpKey + "='" + tmpValue + "'");
            }
        }

        if (pageName.equals("phone")) {
            one_category_id = "1";
            classPath.append("PhoneDetail");
            detail_name = new StringBuffer("phone_detail");
        } else if (pageName.equals("book")) {
            one_category_id = "2";
            classPath.append("BookDetail");
            detail_name = new StringBuffer("book_detail");
        } else {
            one_category_id = "3";
            classPath.append("HourseAppDetail");
            detail_name = new StringBuffer("hourse_app_detail");
        }

        if (conLen == 0) {
            classPath = new StringBuffer("");
        }
        redirectPageDao = new RedirectPageDaoImpl("view_info", one_category_id, pageSize, response, classPath.toString(), detail_name.toString());
        return redirectPageDao.RedirectPage(curPage, conList);

    }
}
