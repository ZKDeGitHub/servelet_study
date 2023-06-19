package com.javasm.servlet.life;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author:
 * @className: ServletLife
 * @description: Servlet的生命周期
 * @date: 2023/5/31 14:49
 * @since: 11
 */
/*
 * Servlet生命周期：
 * 服务器启动，客户端借助浏览器给服务器发第一次请求：(检测看是否存在Servlet实例)
 * 创建Servlet实例，触发init()初始化方法的执行;    只执行一次
 * 触发service()的执行，处理请求;
 *
 * 后续发请求时，触发service()的执行，处理请求;     执行多次    ***
 *
 * 服务器正常关闭时，销毁Servlet实例，触发destroy()的执行     只执行一次
 *
 * 备注：
 *   初始化和销毁的资源操作，可以利用init()和destroy();
 *
 *
 * */
@WebServlet("/life")
public class ServletLife extends GenericServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("执行ServletLife.init()");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("执行ServletLife.service()");
    }

    @Override
    public void destroy() {
        System.out.println("执行ServletLife.destroy()");
    }
}
