package com.felixwc.java8.jdbc.demo;

import com.felixwc.java8.jdbc.utils.MysqlUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * in order to learn java!
 * created at 2021/9/19 14:45
 *
 * @author wangchao
 */
public class BatchDemo {

    public void addUserByBatch() throws SQLException {
        Connection connection = MysqlUtils.getConnection();
        Statement statement = connection.createStatement();
        for (int i = 1000; i <= 2500; i++) {
            String sql = "insert into user values(" + (long)i + ",'张三')";
            statement.addBatch(sql);
            if (0 == i % 50) {
                statement.executeBatch();
            }
        }
        statement.executeBatch();
        MysqlUtils.close(null, statement, connection);
    }

}
