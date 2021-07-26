package com.eight.dao;

import com.eight.bean.ViewInfo;

import java.util.List;
import java.util.Map;

public interface IRedirectPageDao {
    public List<ViewInfo> RedirectPage(String curPage, Map<String,String> comList);
}
