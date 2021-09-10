package com.xiuwei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestfulController {

    ///////////  URL风格的不同 ///////////
    /**
     * 原来的风格：http://localhost:8080/springmvc_04_controller_war_exploded/add?a=1&b=2
     */
    @RequestMapping("/add")
    public String test1(int a, int b, Model model){
        model.addAttribute("msg", "老风格的GET，加法，结果：" + (a + b));
        return "test1";
    }

    /**
     * restful风格：http://localhost:8080/springmvc_04_controller_war_exploded/add/1/2
     */
    @RequestMapping("/add/{a}/{b}")
    public String test2(@PathVariable int a, @PathVariable int b, Model model){
        model.addAttribute("msg", "REST风格的GET，加法，结果：" + (a + b));
        return "test1";
    }

    ///////////  测试不同的method  ///////////
//     @RequestMapping(method = RequestMethod.GET, value = "/add2/{a}/{b}")   // 等价于下面：
    @GetMapping(value = "/add2/{a}/{b}")    //GET方法，加法
    //http://localhost:8080/springmvc_04_controller_war_exploded/add/1/2
    public String test3(@PathVariable int a, @PathVariable int b, Model model){
        model.addAttribute("msg", "GET，加法，结果：" + (a + b));
        return "test1";
    }

    //通过访问：http://localhost:8080/springmvc_04_controller_war_exploded/testPostMapping.jsp， 提交post表单，测试效果。
    @PostMapping(value="/add2/{a}/{b}")     //POST方法，乘法
    public String test4(@PathVariable int a, @PathVariable int b, Model model){
        model.addAttribute("msg", "POST，乘法，结果：" + (a * b));
        return "test1";
    }
}
