package com.zz.web;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 * Created by zz on 2015/5/31.
 */
public class CompressionFilter implements Filter {
    private ServletContext ctx;
    private FilterConfig cfg;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.cfg = filterConfig;
        ctx = cfg.getServletContext();
        ctx.log(cfg.getFilterName()+"initialized.");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        String valid_encondings = request.getHeader("Accept-Encoding");
        if (valid_encondings.indexOf("gzip")>1){
            HttpServletResponseWrapper httpServletResponseWrapper = new HttpServletResponseWrapper(response);
            httpServletResponseWrapper.setHeader("Content-Encoding","gzip");
            filterChain.doFilter(request, httpServletResponseWrapper);
        }
    }

    @Override
    public void destroy() {

    }
}
