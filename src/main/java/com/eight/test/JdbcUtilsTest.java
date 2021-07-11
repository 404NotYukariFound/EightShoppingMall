package com.eight.test;


import com.eight.dao.BaseDao;
import com.eight.utils.JdbcUtils;
import com.eight.bean.*;
import java.sql.Connection;

public class JdbcUtilsTest {
    @org.junit.Test
    public void getConnection() {
        Connection connection = JdbcUtils.getConnection();
        System.out.println(connection);
    }
}