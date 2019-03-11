package com.phone.dao;

import com.phone.model.User;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;

public interface UserDao extends Mapper<User>, IdsMapper<User> {


    User findUser(@Param("username") String username,
                  @Param("password") String password);
}
