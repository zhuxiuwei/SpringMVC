package com.xiuwei.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//实现Controller接口就是控制器了。 http://localhost:8080/springmvc_04_controller_war_exploded/t1
public class ControllerTest1 implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "接口方式");    //添加数据
        mv.setViewName("test1"); //设置视图名字--跳转
        return mv;
    }
}
