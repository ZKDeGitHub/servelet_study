package com.javasm.servlet.exercise.dao;

import com.javasm.servlet.exercise.entity.User;

import java.sql.SQLException;

/**
 * @author:
 * @className: IUserDao
 * @description:
 * @date: 2023/5/31 16:19
 * @since: 11
 */
public interface IUserDao {

    /**
     * 根据用户名查询用户数据
     *
     * @param userName 用户名
     * @return 用户数据
     */
    User findByUserName(String userName) throws SQLException;

    /**
     * 增加用户数据
     *
     * @param user 用户对象
     * @return 成功影响的记录数
     */
    int addUser(User user) throws SQLException;

}
