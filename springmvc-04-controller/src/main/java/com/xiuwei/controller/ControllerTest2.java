package com.xiuwei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //不能写@Component，会404.
public class ControllerTest2{

    @RequestMapping("/t2")
    public String test2(Model model){
        model.addAttribute("msg", "注解方式！");     //保存数据
        return "test1";     //指定视图
    }

}
