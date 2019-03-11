package com.phone.dao;

import com.phone.model.Carts;
import com.phone.vo.CartsVo;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

//@Repository
public interface CartsDao extends Mapper<Carts> {

    int delCartById(Integer id);

    int addCartByProductId(Integer ProductId);

    List<CartsVo> getCarts(Integer userId);
}
