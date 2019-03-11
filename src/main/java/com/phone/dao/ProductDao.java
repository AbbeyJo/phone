package com.phone.dao;

import com.phone.model.Colors;
import com.phone.model.Product;
import com.phone.model.Version;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Auther: Deng.Xiao
 * @Date: 2019/3/7
 * @Description:
 */
public interface ProductDao extends Mapper<Product>, IdsMapper<Product> {

    Product getProById(Integer prId);

    List<Version> getVersionByProId(Integer productId);

    List<Colors> getColorsByProId(Integer productId);

    int shift(@Param("pIdS") Integer[] productId,
                @Param("shift") Integer shift);
}
