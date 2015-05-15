package com.zz.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by zz on 2015/5/14.
 */
public class ListenerTest extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("test context attributes set by listener<br>");
        printWriter.println("<br>");
        Dog dog = (Dog)getServletContext().getAttribute("dog");
        System.out.println(dog.getBreed());
        printWriter.println(dog.getBreed());

    }
}
