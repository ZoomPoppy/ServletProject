package com.zz.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by zz on 2015/5/13.
 */
public class CodeReturn extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/jar");
        ServletContext ctx = getServletContext();
        InputStream is = ctx.getResourceAsStream("/bookCode.jar");
        int read = 0;
        byte[] bytes = new byte[1024];
        OutputStream outputStream = resp.getOutputStream();
        while((read = is.read(bytes))!=-1){
            outputStream.write(bytes,0,read);
        }
        outputStream.flush();
        outputStream.close();
    }
}
