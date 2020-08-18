package com.igeekhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Administrator
 * @create 2019/06/03
 */
@Controller
public class ItemController {
    @RequestMapping("/list")
    @ResponseBody
    public String list(){
        return "item list...";
    }
}
