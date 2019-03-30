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

    /**
     * 获取商品列表 包括商品名模糊查询
     * http://localhost:8001/phone/getAllPro
     * @param keyword 非必须 - 所有商品和模糊查询一个接口
     * @return
     */
    @RequestMapping("/getAllPro")
    public List<Product> getAll(@RequestParam(required = false) String keyword){

        return productService.getAllPro(keyword);
    }

    /**
     * 获取商品详情
     * http://localhost:8001/phone/getProById
     * @param proId
     * @return
     */
    @RequestMapping("/getProById")
    public Product getProById(Integer proId){

        return productService.getProById(proId);
    }

    /**
     * 删除商品
     * http://localhost:8001/phone/delProById
     * @param ids string 数组
     * @return
     */
    @RequestMapping("/delProById")
    public int delProById(String... ids){

        return productService.delProById(ids);
    }

    /**
     * 添加商品
     * http://localhost:8001/phone/addPro
     * @param product
     * @return
     */
    @RequestMapping("/addPro")
    public int addPro(@RequestBody Product product){

        return productService.addPro(product);
    }

    /**
     * 更新商品
     * http://localhost:8001/phone/updatePro
     * @param product
     * @return
     */
    @RequestMapping("/updatePro")
    public int updatePro(@RequestBody Product product){

        return productService.updateProById(product);
    }

    /**
     * 上架商品
     * http://localhost:8001/phone/upShift
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
     * http://localhost:8001/phone/downShift
     * @param productIdS int数组
     * @return
     */
    @RequestMapping("/downShift")
    public int downShift(@RequestParam Integer... productIdS){

        int shift = 0; //下架标识
        return productService.shift(productIdS,shift);
    }
}
