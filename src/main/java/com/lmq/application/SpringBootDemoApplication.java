package com.lmq.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.lmq.application","com.lmq.demo"})
@MapperScan("com.lmq.demo.dao")
public class SpringBootDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

}
