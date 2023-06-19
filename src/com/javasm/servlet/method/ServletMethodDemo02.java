package com.javasm.servlet.method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author:
 * @className: ServletMethodDemo02
 * @description:
 * @date: 2023/5/31 15:05
 * @since: 11
 */
public class ServletMethodDemo02 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 接收配置的初始化参数
        String name = getInitParameter("name");
        System.out.println("name=" + name);//name=null
        // 接收配置的上下文参数
        String address = getServletContext().getInitParameter("address");
        System.out.println("address=" + address);//address=河南郑州

    }
}