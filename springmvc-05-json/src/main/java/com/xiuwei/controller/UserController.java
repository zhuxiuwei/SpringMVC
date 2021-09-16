package com.xiuwei.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiuwei.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController //@RestController，不走视图解析器了，会直接返回一个json
public class UserController {

    //单个对象
    @RequestMapping("/json1")
    //@ResponseBody   //加了ResponseBody注解，就不走视图解析器了，会直接返回一个字符串。(如果配置的不是@RestController，而是普通@Controller)
    public String jacksonJson() throws JsonProcessingException {
        User user = new User("王老二", 18, "男");

        //用Jackson，把对象转json
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);

//        return user.toString(); //User{name='Michael Jackson', age=18, sex='male'}
        return json;    //{"name":"Michael Jackson","age":18,"sex":"male"}
    }

    //集合对象
    @RequestMapping("/json2")
    //@ResponseBody   //加了ResponseBody注解，就不走视图解析器了，会直接返回一个字符串。(如果配置的不是@RestController，而是普通@Controller)
    public String jacksonJson2() throws JsonProcessingException {
        Set<User> users = new HashSet<User>();
        users.add(new User("王老二", 18, "男"));
        users.add(new User("唐大傻", 18, "女"));
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(users);
        return json;    //[{"name":"唐大傻","age":18,"sex":"女"},{"name":"王老二","age":18,"sex":"男"}]
    }
}
