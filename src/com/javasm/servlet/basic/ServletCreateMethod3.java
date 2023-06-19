package com.javasm.servlet.basic;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @author:
 * @className: ServletCreateMethod3
 * @description: Servlet创建方式三
 * @date: 2023/5/31 11:44
 * @since: 11
 */
/*
 * Servlet创建方式三：了解
 * 实现Servlet接口;
 * 重写方法;
 * 配置Servlet;
 *
 * */
@WebServlet("/method3")
public class ServletCreateMethod3 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("执行ServletCreateMethod3.service()");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}