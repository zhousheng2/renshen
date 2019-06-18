package com.rensheng.zhonghuarensheng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.rensheng.zhonghuarensheng.mapper")
public class RenshengApplication {

    public static void main(String[] args) {
        SpringApplication.run(RenshengApplication.class, args);
    }

}
