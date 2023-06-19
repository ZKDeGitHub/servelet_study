package com.javasm.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author:
 * @className: ServletCreateMethod1
 * @description: Servlet创建方式一   ***
 * @date: 2023/5/31 10:15
 * @since: 11
 */
/*
 * Servlet创建方式一：***
 * 继承HttpServlet类;
 * 重写方法;service() | doGet()、doPost()
 * 配置Servlet：
 *   web.xml文件;了解
 *   注解配置;@WebServlet("/xxx")
 * */
@WebServlet("/method1")
public class ServletCreateMethod1 extends HttpServlet {
    /*@Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 接收请求、解析操作、返回响应
    }*/


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 接收请求、解析操作、返回响应
        System.out.println("执行ServletCreateMethod1.doPost()");

    }
}