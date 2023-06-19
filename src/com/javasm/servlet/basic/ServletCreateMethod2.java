package com.javasm.servlet.basic;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @author:
 * @className: ServletCreateMethod2
 * @description: Servlet创建方式二
 * @date: 2023/5/31 11:36
 * @since: 11
 */
/*
 * Servlet创建方式二：了解
 * 继承GenericServlet类;
 * 重写方法;
 * 配置Servlet;
 *
 * */
// 一个项目中，不能出现两个Servlet配置的请求路径相同
@WebServlet("/method2")
public class ServletCreateMethod2 extends GenericServlet {//GenericServlet是HttpServlet类的父类

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        // 接收请求、解析操作、返回响应
        System.out.println("执行ServletCreateMethod2.service()");

    }

    @Override
    public void destroy() {
        super.destroy();
    }
}