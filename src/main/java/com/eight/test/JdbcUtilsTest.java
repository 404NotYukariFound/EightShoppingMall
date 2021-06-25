package com.eight.test;


import com.eight.utils.JdbcUtils;

import java.sql.Connection;

public class JdbcUtilsTest {

    @org.junit.Test
    public void getConnection() {
        Connection connection = JdbcUtils.getConnection();
        System.out.println(connection);
    }
}