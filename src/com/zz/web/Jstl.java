package com.zz.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zz on 2015/5/24.
 */
public class Jstl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] movielist = {"Amelie","Return of the King ","Mean Girls"};
        req.setAttribute("movielist",movielist);
    }
}


