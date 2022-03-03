package com.felixwc.java8.jdbc.utils;

import org.junit.Test;

import java.sql.*;

public class MysqlUtilsTest {
    @Test
    public void getConnectionTest() throws SQLException {
        Connection connection = MysqlUtils.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select current_date()");
        resultSet.next();
        Date date = resultSet.getDate(1);
        System.out.println(date);
        MysqlUtils.close(resultSet,statement,connection);
    }
}