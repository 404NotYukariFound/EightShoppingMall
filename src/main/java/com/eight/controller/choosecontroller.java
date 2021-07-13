package com.eight.controller;

import com.eight.dao.IChooseDao;
import com.eight.dao.impl.ChooseDaoImpl;
import com.eight.mvc.annotation.Controller;
import com.eight.mvc.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class choosecontroller {
    IChooseDao chooseDao=new ChooseDaoImpl();
    @RequestMapping("webpage/toPage.do")
    public String ToPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ToPageController");
        return chooseDao.ToPage(request,response);
    }
}
