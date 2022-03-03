package com.felixwc.java8.jdbc.demo;

import com.felixwc.java8.jdbc.pojo.User;
import com.felixwc.java8.jdbc.utils.MysqlUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 * in order to learn java!
 * created at 2021/9/19 14:11
 *
 * @author wangchao
 */
public class UserDemo {

    public List<User> getAllUser() throws SQLException {
        LinkedList<User> users = new LinkedList<>();
        Connection connection = MysqlUtils.getConnection();
        String sql = "SELECT id,name from user";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            users.add(new User()
                    .setId(resultSet.getLong(1))
                    .setName(resultSet.getString(2)));
        }
        MysqlUtils.close(resultSet,preparedStatement,connection);
        return users;
    }

    /**
     *  根据id 获取用户
     * @param id
     * @return
     * @throws SQLException
     */
    public User getUserById(long id) throws SQLException {
        User user=null;
        Connection connection = MysqlUtils.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select name from user where id = ?");
        preparedStatement.setLong(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()){
            user = new User().setId(id).setName(resultSet.getString(1));
        }
        return user;
    }

    public boolean updateUserById(User user){
        boolean  result = true;
        Connection connection =null;
        PreparedStatement preparedStatement =null;
        try {
            connection = MysqlUtils.getConnection();
            String sql = "update user set name = ? where id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,user.getName());
            preparedStatement.setLong(2,user.getId());
            preparedStatement.executeUpdate();
        } catch (Exception e){
            e.printStackTrace();
            result =false;
        }
        finally {
            MysqlUtils.close(null,preparedStatement,connection);
        }
        return  result;
    }

    public boolean deleteUserById(long id){
        boolean result = true;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try{
            connection = MysqlUtils.getConnection();
            String sql = "delete from user where id = ?";
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setLong(1,id);
            result = preparedStatement.execute();
        }catch (Exception e){
            e.printStackTrace();
            result = false;
        }finally {
            MysqlUtils.close(null,preparedStatement,connection);
        }
        return result;
    }

}
