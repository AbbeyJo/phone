package com.phone.dao;

import com.phone.model.OrderDetail;
import com.phone.vo.OrdersVo;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Auther: Deng.Xiao
 * @Date: 2019/3/14
 * @Description:
 */
public interface OrderDao extends Mapper<OrderDetail>, IdsMapper<OrderDetail> {

    List<OrdersVo> getOrders(Integer userId);
}
