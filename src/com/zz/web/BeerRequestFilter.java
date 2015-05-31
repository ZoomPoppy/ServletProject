package com.zz.web;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by zz on 2015/5/31.
 */
public class BeerRequestFilter implements Filter {
    private FilterConfig fc;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.fc = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String name = httpServletRequest.getRemoteUser();
        if (name != null){
            fc.getServletContext().log("User"+name +"is updating ");

        }
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
