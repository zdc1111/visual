package com.apexsoft.visual;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.apexsoft.visual.mybatis.mapper")
public class VisualApplication {

    public static void main(String[] args) {
        SpringApplication.run(VisualApplication.class, args);
    }

}
