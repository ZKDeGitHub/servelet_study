package com.javasm.servlet.exercise.dao.impl;

import com.javasm.servlet.exercise.dao.IUserDao;
import com.javasm.servlet.exercise.entity.User;
import com.javasm.servlet.exercise.util.DBUtils;
import org.apache.commons.dbutils.BasicRowProcessor;
import org.apache.commons.dbutils.GenerousBeanProcessor;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author:
 * @className: UserDaoImpl
 * @description:
 * @date: 2023/5/31 16:20
 * @since: 11
 */
public class UserDaoImpl implements IUserDao {
    QueryRunner runner = new QueryRunner();

    @Override
    public User findByUserName(String userName) throws SQLException {
        Connection conn = DBUtils.getConn();
        String sql = "select user_id,user_name,user_password,user_age,user_phone,user_email,user_remark " +
                "from t_user " +
                "where user_name=?";
        // 字段(_)和属性(驼峰命名法)
        BeanHandler<User> beanHandler = new BeanHandler<>(User.class, new BasicRowProcessor(new GenerousBeanProcessor()));
        User user = runner.query(conn, sql, beanHandler, userName);
        DBUtils.getClose(conn, null, null);
        return user;
    }

    @Override
    public int addUser(User user) throws SQLException {
        Connection conn = DBUtils.getConn();
        String sql = "insert into " +
                "t_user(user_name,user_password,user_age,user_phone,user_email,user_remark) " +
                "values " +
                "(?,?,?,?,?,?)";
        int rows = runner.update(conn, sql, user.getUserName(), user.getUserPassword(), user.getUserAge(),
                user.getUserPhone(), user.getUserEmail(), user.getUserRemark());
        DBUtils.getClose(conn, null, null);
        return rows;
    }
}
