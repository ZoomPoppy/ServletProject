package com.zz.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by zz on 2015/5/15.
 */
public class SessionTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
//        out.println("test session attributes<br>");
//        HttpSession session = req.getSession(false);
        //URL重写
        Integer count = new Integer(0);
        HttpSession session = req.getSession();
        session.setMaxInactiveInterval(50);//session存活时间50ｓ；
        if (session==null){
            session = req.getSession();
            session.setAttribute("key",count);
        }
        else{
            count = (Integer)session.getAttribute("key");
            if (count!=null){
                count = count+1;
            }
            else {
                count = 0;
            }

        }
        session.setAttribute("key",count);
        out.println("<html><body>");
        out.println("<a href=\"" + resp.encodeURL("?key="+count)+ "\">Click Me </a>"+count);
        out.println("</body></html");
    }
}
