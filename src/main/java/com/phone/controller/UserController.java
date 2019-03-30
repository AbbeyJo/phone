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
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    //URL http://localhost:8001/phone/addUser
    //注册/添加用户
    @RequestMapping("/addUser")
    public int addUser(@RequestBody User user){

        return userService.addUser(user);
    }

    //URL http://localhost:8001/phone/updateUser
    @RequestMapping("/updateUser")
    public int updateUser(@RequestBody User user){

        return userService.updateUser(user);
    }

    /**
     * 登录
     * URL http://localhost:8001/phone/login
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/login")
    public User login(@RequestParam(value = "username") String username,
                             @RequestParam(value = "password") String password){

        return userService.findUser(username,password);
    }

    /**
     * 检测用户名是否存在
     * URL http://localhost:8001/phone/findUserIsExit
     * 若返回code=201 表示账号已被占用 =200 表示可以注册
     * @param username
     * @return
     */
    @RequestMapping("/findUserIsExit")
    public ResponseVo findUserIsExit(@RequestParam("username") String username){

        return userService.findUserByUsername(username);
    }

    /**
     * 删除用户
     * URL http://localhost:8001/phone/delUser
     * @param userIDS int数组m 10,11
     * @return
     */
    @RequestMapping("/delUser")
    public ResponseVo delUser(@RequestParam("userIDS")Integer... userIDS){

        return userService.delUser(userIDS);
    }

    /**
     * 获取所有的用户
     * URL http://localhost:8001/phone/getAllUser
     * @return
     */
    @RequestMapping("/getAllUser")
    public ResponseVo delUser(){

        return userService.getAllUser();
    }
}
