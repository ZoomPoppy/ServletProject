package com.zz.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by zz on 2015/5/14.
 */
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext sc = servletContextEvent.getServletContext();
        String dogBreed  = sc.getInitParameter("breed");
        System.out.println(dogBreed);
        Dog dog = new Dog(dogBreed);
        sc.setAttribute("dog",dog);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
    }
}
