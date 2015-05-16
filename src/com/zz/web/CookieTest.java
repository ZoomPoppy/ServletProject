package com.zz.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zz on 2015/5/16.
 */
public class CookieTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String name = req.getParameter("username");
        Cookie cookie = new Cookie("username",name);
        cookie.setMaxAge(60);
        resp.addCookie(cookie);
        Cookie[] cookies = req.getCookies();
        RequestDispatcher view =req.getRequestDispatcher("cookieresult.jsp");
        view.forward(req,resp);
//        for (int i = 0;i<cookies.length;i+){
//            Cookie cookie = cookies[i];
//            if (cookie.getName().equals("username")){
//                String userName = cookie.getValue();
//
//            }
//        }
//        Cookie cookie = new Cookie("username",);
    }
}

