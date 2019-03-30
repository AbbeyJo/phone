package com.phone.controller;

import com.phone.model.Carts;
import com.phone.service.CartsService;
import com.phone.vo.CartsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {

    @Autowired
    private CartsService cartsService;

    /**
     * 添加购物车
     * URL http://localhost:8001/phone/addCart
     * @param carts
     * @return
     */
    @RequestMapping("/addCart")
    public int addCart(@RequestBody Carts carts){
        return cartsService.addCartByProductId(carts);
    }

    /**
     * 获取购物车列表
     * URL http://localhost:8001/phone/getCarts
     * @param userId
     * @return
     */
    @RequestMapping("/getCarts")
    public List<CartsVo> getCarts(@RequestParam Integer userId){
        return cartsService.getCarts(userId);
    }

    /**
     * 删除购物车
     * URL http://localhost:8001/phone/delCart
     * @param ids
     * @return
     */
    @RequestMapping("/delCart")
    public int delCart(@RequestParam Integer... ids){
        return cartsService.delCartById(ids);
    }
}
