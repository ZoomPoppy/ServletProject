package com.zz.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zz on 2015/5/20.
 */
public class beanTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        NewPerson person = new NewPerson();
        person.setName("abc");

        Dog dog = new Dog();
        dog.setBreed("spike");
        person.setDog(dog);
        req.setAttribute("newPerson", person);
        RequestDispatcher view = req.getRequestDispatcher("javaBean.jsp");
        view.forward(req,resp);
    }
}
