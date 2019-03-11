package com.phone.service;

import com.phone.model.Product;

import java.util.List;

/**
 * @Auther: jiangxinyang
 * @Date: 2019/03/11 10:41
 * @Description:
 */
public interface ProductService {

    List<Product> getAllPro();

    Product getProById(Integer id);

    int delProById(String... ids);

    int addPro(Product product);

    int updateProById(Product product);

    int shift(Integer[] productId,Integer isShift);
}
