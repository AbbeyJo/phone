package com.phone.service;

import com.phone.model.Product;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * @Auther: jiangxinyang
 * @Date: 2019/03/11 10:41
 * @Description:
 */
public interface ProductService {

    public List<Product> getAllPro();

    public Product getProById(Integer id);

    public int delProById(String... ids);

    public int addPro(Product product);

    public int updateProById(Product product);
}
