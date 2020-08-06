package com.renshen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.renshen.mapper")
public class RenshenApplication {

    public static void main(String[] args) {
        SpringApplication.run(RenshenApplication.class, args);
    }


}
