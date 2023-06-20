package com.javasm.servlet.exercise.servlet;

import com.javasm.servlet.exercise.entity.User;
import com.javasm.servlet.exercise.service.IUserService;
import com.javasm.servlet.exercise.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author:
 * @className: RegistServlet
 * @description:
 * @date: 2023/5/31 16:24
 * @since: 11
 */
/*
 * 后端代码整体测试：
 *   至少2次测试：dao   servlet
 *
 *   浏览器地址栏直接敲地址，比如：
 *   http://localhost:8080/servelet_study_war_exploded/regist?userName=maria&userPassword=1234&userAge=18&userPhone=15617891980&userEmail=86621@qq.com&userRemark=123243
 */
@WebServlet("/regist")
public class RegistServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 接收请求数据
        req.setCharacterEncoding("utf-8");
        String userName = req.getParameter("userName");
        String userPassword = req.getParameter("userPassword");
        String userAgeStr = req.getParameter("userAge");

        // 判断：不能是空，不能是""
        Integer userAge = null;
        if (userAgeStr != null && !"".equals(userAgeStr)) {
            userAge = Integer.valueOf(userAgeStr);
        }
        String userPhone = req.getParameter("userPhone");
        String userEmail = req.getParameter("userEmail");
        String userRemark = req.getParameter("userRemark");
        User user = new User(null, userName, userPassword, userAge, userPhone, userEmail, userRemark);

        // 调用业务层
        IUserService userService = new UserServiceImpl();

        // 判断用户名是否可用
        User byUserName = userService.findByUserName(userName);

        // 写出响应数据
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = resp.getWriter();

        // 用户名被占用，重新去注册
        if (byUserName != null) {

            // 使用Servlet，通过输出流写出完整的页面
            writer.print("<p style='color:red'>用户名被占用</p>");
            writer.print("<a href='/servelet_study_war_exploded/user/regist.html'>点此重新去注册</a>");

            /*writer.print("<html>");
            writer.print("<head>");
            writer.print("<title>Document</title>");
            writer.print("</head>");
            writer.print("</html>");*/
        } else {
            // 用户名可用
            int rows = userService.addUser(user);
            // 判断
            if (rows > 0) {
                // 执行成功，去登录
                writer.print("<p style='color:green'>注册成功</p>");
                writer.print("<a href='/servelet_study_war_exploded/user/login.html'>点此去登录</a>");
            } else {
                // 执行失败，重新去注册
                writer.print("<p style='color:red'>注册失败</p>");
                writer.print("<a href='/servelet_study_war_exploded/user/regist.html'>点此重新去注册</a>");
            }
        }
        // 资源关闭
        writer.flush();
        writer.close();
    }
}
