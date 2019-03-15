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
     *
     * @param orderDetail
     * @return
     */
    @RequestMapping("/addOrder")
    public int addOrder(@RequestBody OrderDetail orderDetail){

        return orderService.addOrder(orderDetail);
    }

    @RequestMapping("/pay")
    public int pay(@RequestParam("orderId") Integer orderId){

        int payStatus = 1;
        return orderService.pay(orderId,payStatus);
    }

    @RequestMapping("/delOrder")
    public int delOrder(@RequestParam("orderIds") Integer... orderIds){

        return orderService.delOrder(orderIds);
    }

    @RequestMapping("/getOrders")
    public List<OrdersVo> getOrders(@RequestParam("userId") Integer userId){

        return orderService.getOrders(userId);
    }
}
