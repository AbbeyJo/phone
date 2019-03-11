package com.phone.dao;

import com.phone.model.Colors;
import com.phone.model.Product;
import com.phone.model.Version;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Auther: Deng.Xiao
 * @Date: 2019/3/7
 * @Description:
 */
public interface ProductDao extends Mapper<Product>, IdsMapper<Product> {

    List<Product> getProById(Integer prId);

    List<Version> getVersionByProId(Integer prId);

    List<Colors> getColorsByProId(Integer prId);
}
