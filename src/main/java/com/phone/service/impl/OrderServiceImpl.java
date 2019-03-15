package com.phone.service.impl;

import com.phone.dao.OrderDao;
import com.phone.model.OrderDetail;
import com.phone.service.OrderService;
import com.phone.vo.OrdersVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Deng.Xiao
 * @Date: 2019/3/14
 * @Description:
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;


    @Override
    public int addOrder(OrderDetail orderDetail) {
        return orderDao.insertSelective(orderDetail);
    }

    @Override
    public int pay(Integer orderId, int payStatus) {

        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setId(orderId);
        orderDetail.setPayStatus(payStatus);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return orderDao.updateByPrimaryKeySelective(orderDetail);
    }

    @Override
    public int delOrder(Integer... orderIds) {

        String join = StringUtils.join(orderIds, ',');
        return orderDao.deleteByIds(join);
    }

    @Override
    public List<OrdersVo> getOrders(Integer userId) {
        return orderDao.getOrders(userId);
    }
}
