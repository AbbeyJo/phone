package com.phone.service.impl;

import com.phone.dao.CartsDao;
import com.phone.model.Carts;
import com.phone.service.CartsService;
import com.phone.vo.CartsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: jiangxinyang
 * @Date: 2019/03/11 10:50
 * @Description:
 */
@Service
public class CartsServiceImpl implements CartsService {

    @Autowired
    private CartsDao cartsDao;

    @Override
    public List<Carts> getCartsList() {
        return null;
    }

    @Override
    public int addCartByProductId(int peoductId) {
        return 0;
    }

    @Override
    public int delCartById(int id) {
        return 0;
    }

    @Override
    public List<CartsVo> getCarts(Integer userId) {
        return cartsDao.getCarts(userId);
    }
}
