package com.demomarket;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.demomarket.mapper")
public class DemoMarketApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMarketApplication.class, args);
    }

}
