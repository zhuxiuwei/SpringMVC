package com.xiuwei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试转发和重定向
 */
@Controller
public class TryForwardAndRedirectController {

    @RequestMapping("/redirect/test")
    public String test(Model model){
        /**
         * 默认就是转发（url地址不变）
         * 想要重定向，需要加上： redirect前缀（url地址会跟着变）
         */
        model.addAttribute("msg", "测试！！");
        return "redirect:/index.jsp";   //重定向
    }

}
