package com.aaa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 将当前类注册为springboot应用程序
@SpringBootApplication

// @MapperScan(basePackages = "com.aaa.dao")
public class SpringbootStart {

    public static void main(String[] args) {
        // 运行spring应用程序
        SpringApplication.run(SpringbootStart.class);
    }
}
