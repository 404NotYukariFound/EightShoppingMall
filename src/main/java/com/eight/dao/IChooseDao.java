package com.eight.dao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface IChooseDao {
    public String ToPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
