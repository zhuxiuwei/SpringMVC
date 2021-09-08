package com.xiuwei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("v1")
public class HelloController {

    @RequestMapping("h1")   // 地址：http://localhost:8080/{app}/v1/h1
    public String hello(Model model){
        //封装数据
        model.addAttribute("msg", "this is fucking msg!!");
        return "hi_landing_page";  //会被视图解析器处理
    }
}
