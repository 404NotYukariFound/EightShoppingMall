package com.eight.controller;

import com.eight.dao.IViewDao;
import com.eight.dao.impl.ViewDaoImpl;
import com.eight.mvc.annotation.Controller;
import com.eight.mvc.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class viewcontroller {
    IViewDao viewDao=new ViewDaoImpl();
    @RequestMapping("view.do")
    public String ViewPage(HttpSession session, HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        return viewDao.ViewPage(session,request,response);
    }
}
