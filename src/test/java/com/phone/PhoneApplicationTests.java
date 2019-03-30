package com.phone;

import com.phone.model.Product;
import com.phone.model.User;
import com.phone.service.CartsService;
import com.phone.service.ProductService;
import com.phone.service.UserService;
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
    
    @Autowired
    private UserService userservice;
    
    
    @Test
    public void test() {
    	User user = new User();
    	user.setPassword("121");
    	user.setUserName("张三");
    	User user1 = userservice.findUser("张三", "121");
    }
    
    
    
    

  



}
