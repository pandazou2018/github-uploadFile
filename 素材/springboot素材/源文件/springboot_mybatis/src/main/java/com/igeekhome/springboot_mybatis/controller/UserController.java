package com.igeekhome.springboot_mybatis.controller;

import com.igeekhome.springboot_mybatis.mapper.UserMapper;
import com.igeekhome.springboot_mybatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Administrator
 * @create 2019/06/04
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/list")
    public List<User> list(){
        return userMapper.list();
    }
}
