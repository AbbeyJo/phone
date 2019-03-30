package com.phone.service.impl;

import com.phone.dao.UserDao;
import com.phone.model.User;
import com.phone.service.UserService;
import com.phone.vo.ResponseVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public int addUser(User user){

        return userDao.insert(user);
    }

    @Override
    public User findUser(String username,String password){

    	User  user = userDao.findUser(username,password);
//    	User user = new User();
//    	user.setPassword(password);
//    	user.setUserName(username);
//    	User userDto = userDao.selectOne(user);
//    	System.out.print(userDto.toString());
        return user;
    }

    @Override
    public ResponseVo findUserByUsername(String username) {

        User user = new User();
        user.setUserName(username);
        int i = userDao.selectCount(user);
        if (i > 0){

            return ResponseVo.error(201,"账号已被占用");
        }
        return ResponseVo.OK(null);
    }

    @Override
    public ResponseVo delUser(Integer[] userIDS) {

        String join = StringUtils.join(userIDS, ',');
        try {

            userDao.deleteByIds(join);
            return ResponseVo.OK(200,"删除成功");
        }catch (Exception e) {
            e.printStackTrace();
            return ResponseVo.error(201,"删除失败");
        }

    }

    @Override
    public int updateUser(User user) {
        return userDao.updateByPrimaryKeySelective(user);
    }

    @Override
    public ResponseVo getAllUser() {
        List<User> users = userDao.selectAll();
        return ResponseVo.OK(users,200,"获取所有用户成功");
    }
}
