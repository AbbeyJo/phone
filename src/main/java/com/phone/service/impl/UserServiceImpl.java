package com.phone.service.impl;

import com.phone.dao.UserDao;
import com.phone.model.User;
import com.phone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public int addUser(User user){

        return userDao.insert(user);
    }

    public User findUserById(Integer userId){

        return userDao.selectByPrimaryKey(userId);
    }
}
