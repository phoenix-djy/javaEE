package com.baizhi.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FirstServlet extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("我是第一個servlet程序");
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
      //  resp.sendRedirect("/index.jsp");


    }
}
