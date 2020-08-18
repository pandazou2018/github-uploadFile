package com.igeekhome.springboot_qs.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 * @create 2019/06/04
 */
@Controller
public class UserController {
    @RequestMapping("/user")
    public String user(Model model){
        model.addAttribute("username","张三");
        model.addAttribute("role","管理员");

        return "user";
    }

}
