package com.hlc.FirstWeb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan("com.hlc.FirstWeb.mapper")
public class FirstWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstWebApplication.class, args);
    }
}
