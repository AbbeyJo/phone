package com.phone.dao;

import com.phone.model.User;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;

public interface UserDao extends Mapper<User>, IdsMapper<User> {
}
