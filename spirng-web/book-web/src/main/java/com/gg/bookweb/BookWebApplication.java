package com.gg.bookweb;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@MapperScan("com.gg.mapper")
public class BookWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookWebApplication.class, args);
    }

}
