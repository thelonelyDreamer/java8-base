package com.felixwc.java8.jdbc.utils;

import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class MysqlUtilsTest {
    @Test
    public void getConnectionTest() throws SQLException {
        Connection connection = MysqlUtils.getConnection();
    }
}