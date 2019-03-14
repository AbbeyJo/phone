package com.phone.dao;

import com.phone.model.Carts;
import com.phone.vo.CartsVo;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface CartsDao extends Mapper<Carts>, IdsMapper<Carts> {

    int delCartById(Integer id);

    int addCartByProductId(Integer ProductId);

    List<CartsVo> getCarts(Integer userId);
}
