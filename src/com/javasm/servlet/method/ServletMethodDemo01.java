package com.javasm.servlet.method;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author:
 * @className: ServletMethodDemo01
 * @description:
 * @date: 2023/5/31 15:04
 * @since: 11
 */
public class ServletMethodDemo01 extends GenericServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("执行ServletMethodDemo01.init()");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("执行ServletMethodDemo01.service()");
        // 接收配置的初始化参数  只能服务于当前Servlet
        String name = getInitParameter("name");
        System.out.println("name=" + name);//name=tom
        // 接收配置的上下文参数   服务于多个Servlet
        String address = getServletContext().getInitParameter("address");
        System.out.println("address=" + address);//address=河南郑州
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}