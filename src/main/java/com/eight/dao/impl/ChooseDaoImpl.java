package com.eight.dao.impl;

import com.eight.dao.IChooseDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ChooseDaoImpl implements IChooseDao {

    @Override
    public String ToPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pageName=request.getParameter("pageName");
        return "redirect:"+"/webpage/commodityPage/"+pageName+".jsp";
    }
}
