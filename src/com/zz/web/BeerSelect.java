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
        /* response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Beer Selection Advice<br>");*/
        String c = request.getParameter("color");
        //out.println("<br>Got beer color"+c);
        List result = beerExpert.getBrands(c);
        request.setAttribute("styles",result);
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request,response);
    }
}
