package com.zz.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by zz on 2015/5/14.
 */
public class InitParams extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("test init parameters<br>");

        Enumeration e = getServletConfig().getInitParameterNames();
        while (e.hasMoreElements()){
            printWriter.println("<br>param name = "+e.nextElement()+"<br>");
        }
        printWriter.println("main email is "+getServletConfig().getInitParameter("mainEmail"));
        printWriter.println("<br>");
        printWriter.println("admin email is "+getServletConfig().getInitParameter("adminEmail"));
    }
}
