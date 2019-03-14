package com.phone.service.impl;

import com.phone.dao.CartsDao;
import com.phone.model.Carts;
import com.phone.service.CartsService;
import com.phone.vo.CartsVo;
import org.apache.commons.lang3.StringUtils;
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
    public int addCartByProductId(Carts carts) {
        return cartsDao.insertSelective(carts);
    }

    @Override
    public int delCartById(Integer... ids) {
        String join = StringUtils.join(ids, ",");
        return cartsDao.deleteByIds(join);
    }

    @Override
    public List<CartsVo> getCarts(Integer userId) {
        return cartsDao.getCarts(userId);
    }
}
