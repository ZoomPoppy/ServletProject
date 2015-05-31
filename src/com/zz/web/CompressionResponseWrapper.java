package com.zz.web;


import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.PrintWriter;
import java.util.zip.GZIPOutputStream;

/**
 * Created by zz on 2015/5/31.
 */
public class CompressionResponseWrapper extends HttpServletResponseWrapper {
    private GZIPOutputStream servletGzipOs = null;
    private PrintWriter pw = null;
    CompressionResponseWrapper(HttpServletResponse response){
        super(response);
    }
    public void serComtentLength(int len){}
}
