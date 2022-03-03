package com.felixwc.java8.jdbc.demo;

import com.felixwc.java8.jdbc.pojo.User;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

public class UserDemoTest {

    @Test
    public void getUsers(){
        try {
            List<User> allUser = new UserDemo().getAllUser();
            allUser.stream().forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getUserById() {
        try {
            User user = new UserDemo().getUserById(2L);
            System.out.println(user);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Test
    public void updateUserByIdTest(){
        new UserDemo().updateUserById(new User().setId(2).setName("sunshine"));
    }

    @Test
    public void deleteUserByIdTest() {
        boolean rt = new  UserDemo().deleteUserById(1495536628561641473L);
        System.out.println(rt);
    }
}