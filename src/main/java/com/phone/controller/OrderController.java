package com.phone.controller;

import com.phone.model.OrderDetail;
import com.phone.service.OrderService;
import com.phone.vo.OrdersVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 生成订单
     * URL http://localhost:8001/phone/order/addOrder
     * @param orderDetail
     * @return
     */
    @RequestMapping("/addOrder")
    public int addOrder(@RequestBody OrderDetail orderDetail){

        return orderService.addOrder(orderDetail);
    }

    /**
     * 支付
     * URL http://localhost:8001/phone/order/pay
     * @param orderId
     * @return
     */
    @RequestMapping("/pay")
    public int pay(@RequestParam("orderId") Integer orderId){

        int payStatus = 1;
        return orderService.pay(orderId,payStatus);
    }

    /**
     * 删除订单
     * URL http://localhost:8001/phone/order/delOrder
     * @param orderIds int数组
     * @return
     */
    @RequestMapping("/delOrder")
    public int delOrder(@RequestParam("orderIds") Integer... orderIds){

        return orderService.delOrder(orderIds);
    }

    /**
     * 获取订单列表
     * URL http://localhost:8001/phone/order/getOrders
     * @param userId
     * @return
     */
    @RequestMapping("/getOrders")
    public List<OrdersVo> getOrders(@RequestParam("userId") Integer userId){

        return orderService.getOrders(userId);
    }
}
