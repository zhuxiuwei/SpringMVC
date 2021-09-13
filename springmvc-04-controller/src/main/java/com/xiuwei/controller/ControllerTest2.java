package com.xiuwei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //不能写@Component，会404.
public class ControllerTest2{

    //http://localhost:8080/springmvc_04_controller_war_exploded/t2
    @RequestMapping("/t2")
    public String test2(Model model){
        model.addAttribute("msg", "注解方式！");     //保存数据
        return "test1";     //指定视图
    }

    //测试中文乱码问题
    @RequestMapping("/e/t")
    public String test(Model model,String name){
        model.addAttribute("msg",name); //获取表单提交的值
        return "test1"; //跳转到test页面显示输入的值
    }

}
