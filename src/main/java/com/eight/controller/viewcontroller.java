package com.eight.controller;

import com.eight.dao.IViewDao;
import com.eight.dao.impl.ViewDaoImpl;
import com.eight.mvc.annotation.Controller;
import com.eight.mvc.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class viewcontroller {
    IViewDao viewDao=new ViewDaoImpl();
    @RequestMapping("webpage/view.do")
    public String ViewPage(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        return viewDao.ViewPage(request,response);
    }
//    @RequestMapping("webpage/book")
//    public String ViewBookPage(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
//        return viewDao.ViewBookPage(request,response);
//    }
//    @RequestMapping("webpage/furniture")
//    public String ViewFurniturePage(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
//        return viewDao.ViewFurniturePage(request,response);
//    }
//    @RequestMapping("webpage/phone")
//    public String ViewPhonePage(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
//        return viewDao.ViewPhonePage(request,response);
//    }
}
