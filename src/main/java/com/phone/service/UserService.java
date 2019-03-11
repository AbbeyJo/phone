package com.phone.service;

import com.phone.model.User;

/**
 * @Auther: jiangxinyang
 * @Date: 2019/03/11 10:49
 * @Description:
 */
public interface UserService {

    public int addUser(User user);

    public User findUserById(Integer userId);
}
