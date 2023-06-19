package com.javasm.servlet.method;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author:
 * @className: ServletMethodDemo03
 * @description: servlet常用方法
 * @date: 2023/5/31 15:23
 * @since: 11
 */
@WebServlet("/demo03")
public class ServletMethodDemo03 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 接收请求数据
        /**
         * get请求：
         *  常用于获取数据
         *  url?key=val&key=val&...
         *  http://localhost:8080/demo03?userName=tom
         *
         *  浏览器地址栏敲地址;
         *  form表单，设置method值为get;
         *  location.href;
         *  超链接;
         *
         * post请求：
         *  form表单，设置method值为post;
         *
         */
        // setCharacterEncoding()：设置字符编码格式
        req.setCharacterEncoding("utf-8");
        // getParameter()：获取请求数据   根据key获取val，返回值是String类型
        String userName = req.getParameter("userName");
        System.out.println("userName=" + userName);
        // ...
        // 设置响应数据不乱码
        resp.setContentType("text/html;charset=utf-8");//注意：text->test  页面下载现象
        // 写出响应数据
        // 获取输出流
        PrintWriter writer = resp.getWriter();
        // 写出响应数据
        writer.print("你好：" + userName);
        // 资源关闭
        writer.flush();
        writer.close();
    }
}