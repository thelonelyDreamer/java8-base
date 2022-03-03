package com.felixwc.java8.jdbc.utils;

import java.sql.*;
import java.util.ResourceBundle;

/**
 * in order to learn java!
 * created at 2021/9/19 13:21
 *
 * @author wangchao
 */
public class MysqlUtils {
    private static String driver;
    private static String url;
    private static String username;
    private static String password;

    static {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("db");
        driver = resourceBundle.getString("db.driver");
        url = resourceBundle.getString("db.url");
        username = resourceBundle.getString("db.username");
        password = resourceBundle.getString("db.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //获取数据库连接
    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

    //关闭数据库对象
    public static void close(ResultSet resultSet, Statement statement, Connection connection) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null){
                connection.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

