package com.zz.web;

import com.zz.model.BeerExpert;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by zz on 2015/5/12.
 */
public class BeerSelect extends HttpServlet  {
    public void doPost(HttpServletRequest request,HttpServletResponse response)
    throws IOException,ServletException{
         BeerExpert beerExpert = new BeerExpert();
//        PrintWriter out = response.getWriter();
//        out.println("Beer Selection Advice<br>");
//        out.println("<br>Got beer color"+c);
        response.setContentType("text/html");
        String c = request.getParameter("color");
        String[] a = request.getParameterValues("sizes");
        String b = request.getParameter("body");
        List result = beerExpert.getBrands(c);
/*        response.setHeader("foo","bar");
        response.addHeader("foo","bar");
        response.setIntHeader("foo",42);*/
        request.setAttribute("styles",result);
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request,response);
       // response.sendRedirect("https://www.baidu.com/");//÷ÿ∂®œÚ

    }
}
