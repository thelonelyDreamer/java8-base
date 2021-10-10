package com.felixwc.java8.jdbc.demo;

import com.felixwc.java8.jdbc.pojo.User;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

public class UserDemoTest {
    @Test
    public void getUsers(){
        try {
            List<User> allUser = new UserDemo().getAllUser();
            allUser.stream().forEach(System.out::println);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Test
    public void getUserById() {
        try {
            User user = new UserDemo().getUserById(1L);
            System.out.println(user);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}