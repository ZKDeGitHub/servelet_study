package com.javasm.servlet.exercise.service.impl;

import com.javasm.servlet.exercise.dao.IUserDao;
import com.javasm.servlet.exercise.dao.impl.UserDaoImpl;
import com.javasm.servlet.exercise.entity.User;
import com.javasm.servlet.exercise.service.IUserService;

import java.sql.SQLException;

/**
 * @author:
 * @className: UserServiceImpl
 * @description:
 * @date: 2023/5/31 16:20
 * @since: 11
 */
public class UserServiceImpl implements IUserService {
    IUserDao userDao = new UserDaoImpl();

    @Override
    public User findByUserName(String userName) {
        User user = null;
        try {
            user = userDao.findByUserName(userName);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }

    @Override
    public int addUser(User user) {
        int rows = 0;
        try {
            rows = userDao.addUser(user);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rows;
    }
}
