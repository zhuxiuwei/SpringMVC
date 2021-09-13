package com.xiuwei.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiuwei.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @ResponseBody   //加了ResponseBody注解，就不走视图解析器了，会直接返回一个字符串
    @RequestMapping("/json1")
    public String json1() throws JsonProcessingException {
        User user = new User("Michael Jackson", 18, "male");

        //用Jackson，把对象转json
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);

//        return user.toString(); //User{name='Michael Jackson', age=18, sex='male'}
        return json;
    }
}
