package com.phone.controller;

import com.phone.model.User;
import com.phone.service.impl.UserServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    //注册/添加用户
    @RequestMapping("/addUser")
    public int addUser(@RequestBody User user){

        return userService.addUser(user);
    }

    @RequestMapping("/login")
    public User findUserById(@Param("userId") Integer userId){

        return userService.findUserById(userId);
    }
}
