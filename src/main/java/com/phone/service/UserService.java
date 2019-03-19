package com.phone.service;

import com.phone.model.User;
import com.phone.vo.ResponseVo;

/**
 * @Auther: jiangxinyang
 * @Date: 2019/03/11 10:49
 * @Description:
 */
public interface UserService {

    int addUser(User user);

    User findUser(String username,String password);

    //检测用户名是否存在
    ResponseVo findUserByUsername(String username);

    ResponseVo delUser(Integer[] userIDS);

    int updateUser(User user);
}
