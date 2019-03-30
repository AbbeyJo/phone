package com.phone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.phone.dao"})
public class PhoneApplication {

    public static void main(String[] args) {

        SpringApplication.run(PhoneApplication.class, args);
    }
}
