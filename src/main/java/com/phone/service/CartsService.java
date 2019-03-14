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


    int addCartByProductId(Carts carts);

    int delCartById(Integer... ids);

    List<CartsVo> getCarts(Integer userId);
}
