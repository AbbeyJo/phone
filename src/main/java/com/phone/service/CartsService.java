package com.phone.service;


import com.phone.model.Carts;
import com.phone.vo.CartsVo;

import java.util.List;

/**
 * @Auther: dengxiao
 * @Date: 2018/12/26 17:23
 * @Description:
 */
public interface CartsService {

    List<Carts> getCartsList();

    int addCartByProductId(int peoductId);

    int delCartById(int id);

    List<CartsVo> getCarts(Integer userId);
}
