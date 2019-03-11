package com.phone;

import com.phone.model.Product;
import com.phone.service.CartsService;
import com.phone.service.ProductService;
import com.phone.vo.CartsVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ComponentScan("com.phone")
@MapperScan("com.phone.dao")
@Slf4j
public class PhoneApplicationTests {

    @Autowired
    private ProductService productService;

    @Autowired
    private CartsService cartsService;

    @Test
    public void testProd() {

        List<Product> allPro = productService.getAllPro();

        log.info("....... {}",allPro.size());
    }

    @Test
    public void testCart() {

        List<CartsVo> carts = cartsService.getCarts(10);
        log.info("......{}",carts);
    }



}
