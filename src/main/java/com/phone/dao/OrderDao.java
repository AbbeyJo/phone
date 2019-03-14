package com.phone.dao;

import com.phone.model.OrderDetail;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Auther: Deng.Xiao
 * @Date: 2019/3/14
 * @Description:
 */
public interface OrderDao extends Mapper<OrderDetail>, IdsMapper<OrderDetail> {
}
