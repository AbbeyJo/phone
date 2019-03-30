package com.phone.service.impl;

import com.phone.dao.ProductDao;
import com.phone.model.Product;
import com.phone.service.ProductService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Deng.Xiao
 * @Date: 2019/3/7
 * @Description:
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    public List<Product> getAllPro(String keyword){


        return productDao.selectAllPro(keyword);
    }

    public Product getProById(Integer id){

        return productDao.getProById(id);
    }

    public int delProById(String... ids){

        String join = StringUtils.join(ids, ",");
        return productDao.deleteByIds(join);
    }

    public int addPro(Product product){

    	
        return productDao.insert(product);
    }

    public int updateProById(Product product){

        return productDao.updateByPrimaryKeySelective(product);
    }

    @Override
    public int shift(Integer[] productId,Integer isShift) {

        return productDao.shift(productId,isShift);
    }
}
