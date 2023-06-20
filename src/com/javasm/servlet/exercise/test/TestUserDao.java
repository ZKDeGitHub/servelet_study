package com.javasm.servlet.exercise.test;

import com.javasm.servlet.exercise.dao.IUserDao;
import com.javasm.servlet.exercise.dao.impl.UserDaoImpl;
import com.javasm.servlet.exercise.entity.User;
import org.junit.Test;

import java.sql.SQLException;

public class TestUserDao {
    IUserDao userDao = new UserDaoImpl();

    @Test
    public void test01() throws SQLException {
        System.out.println(userDao.findByUserName("zhangsan"));
    }

    @Test
    public void test02() throws SQLException {
        User user = new User();
        user.setUserName("jack");

        user.setUserPassword("1234");
        System.out.println(userDao.addUser(user));
    }



}
