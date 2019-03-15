package com.phone.service;

import com.phone.model.OrderDetail;
import com.phone.vo.OrdersVo;

import java.util.List;

/**
 * @Auther: Deng.Xiao
 * @Date: 2019/3/14
 * @Description:
 */
public interface OrderService {

    int addOrder(OrderDetail orderDetail);


    int pay(Integer orderId, int payStatus);

    int delOrder(Integer... orderIds);

    List<OrdersVo> getOrders(Integer userId);
}
