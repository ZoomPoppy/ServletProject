package com.zz.web;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by zz on 2015/5/16.
 */
public class BeerSessionCounter implements HttpSessionListener {
    private  int count = 0;
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        count++;
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        count--;
    }

    public int getCount() {
        return count;
    }
}
