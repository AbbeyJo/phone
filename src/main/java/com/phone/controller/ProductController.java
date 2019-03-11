package com.phone.controller;

import com.phone.model.Product;
import com.phone.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/getAllPro")
    public List<Product> getAll(){

        return productService.getAllPro();
    }

    @RequestMapping("/getProById")
    public Product getProById(Integer proId){

        return productService.getProById(proId);
    }

    /**
     * 删除商品
     * @param ids string 数组
     * @return
     */
    @RequestMapping("/delProById")
    public int delProById(String... ids){

        return productService.delProById(ids);
    }

    @RequestMapping("/addPro")
    public int updatePro(@RequestBody Product product){

        return productService.updateProById(product);
    }

    /**
     * 上架商品
     * @param productIdS int数组
     * @return
     */
    @RequestMapping("/upShift")
    public int upShift(@RequestParam Integer... productIdS){

        int shift = 1;
        return productService.shift(productIdS,shift);
    }

    /**
     * 下架商品
     * @param productIdS int数组
     * @return
     */
    @RequestMapping("/downShift")
    public int downShift(@RequestParam Integer... productIdS){

        int shift = 0; //下架标识
        return productService.shift(productIdS,shift);
    }
}
