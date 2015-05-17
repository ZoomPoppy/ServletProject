package com.zz.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zz on 2015/5/17.
 */
public class Hobby extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String hobby = req.getParameter("hobby");
        req.setAttribute("hobby",hobby);
        RequestDispatcher view = req.getRequestDispatcher("hobbyTest.jsp");
        view.forward(req,resp);
    }
}
