package com.phone.controller;

import com.phone.model.Product;
import com.phone.service.ProductService;
import com.phone.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/getAllPro")
    @ResponseBody
    public List<Product> getAll(){

        return productService.getAllPro();
    }

    @RequestMapping("/getProById")
    @ResponseBody
    public Product getProById(Integer proId){

        return productService.getProById(proId);
    }

    @RequestMapping("/delProById")
    public int delProById(String... ids){

        return productService.delProById(ids);
    }

    @RequestMapping("/addPro")
    public int updatePro(@RequestBody Product product){

        return productService.updateProById(product);
    }
}
