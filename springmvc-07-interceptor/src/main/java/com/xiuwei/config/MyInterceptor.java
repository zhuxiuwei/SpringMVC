package com.xiuwei.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {


    /**
     * return true: 执行下一个拦截器/controller方法
     * return false: 不执行下一个拦截器/controller方法 （执行到此为止，连controller都不进去了。）
     * 高鹏设计模式，也提到了代理模式这个特性：代理类可以控制被代理类是否真正执行。
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("----------MyInterceptor执行前-----------");
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("----------MyInterceptor执行后-----------");
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("----------MyInterceptor清理-----------");
    }
}
