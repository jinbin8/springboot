package com.example.demo.controller;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Resource
    private UserService userService;

    @GetMapping("/userInfo")
    public List<User> getUser(){
        return userService.getUser();
    }


    @GetMapping("/test")
    public String getTest(){
        return "hello，赵老信你好----我要做最高的赵高，一人之下万人之上的赵高";
    }
    @GetMapping("/aaa")
    public String aaa(){
        return "aaa";
    }
}