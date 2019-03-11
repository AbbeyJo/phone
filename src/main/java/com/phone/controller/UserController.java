package com.phone.controller;

import com.phone.model.User;
import com.phone.service.impl.UserServiceImpl;
import com.phone.vo.ResponseVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public User findUserById(@RequestParam("username") String username,
                             @RequestParam("password") String password){

        return userService.findUser(username,password);
    }

    /**
     * 检测用户名是否存在
     * @param username
     * @return
     */
    @RequestMapping("/findUserIsExit")
    public ResponseVo findUserById(@RequestParam("username") String username){

        return userService.findUserByUsername(username);
    }

    @RequestMapping("/delUser")
    public ResponseVo delUser(Integer... userIDS){

        return userService.delUser(userIDS);
    }
}
