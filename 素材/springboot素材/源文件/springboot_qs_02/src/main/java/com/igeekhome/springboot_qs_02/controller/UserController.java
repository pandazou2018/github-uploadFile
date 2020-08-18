package com.igeekhome.springboot_qs_02.controller;

import com.igeekhome.springboot_qs_02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Administrator
 * @create 2019/06/03
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(){

        System.out.println("userService===>"+userService);
        return "hello world";
    }
}
