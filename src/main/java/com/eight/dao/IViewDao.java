package com.eight.dao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public interface IViewDao {
    public String ViewPage(HttpSession session,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
