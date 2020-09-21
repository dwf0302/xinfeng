package com.noah.xinfeng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.noah.xinfeng")
public class XinfengApplication {

    public static void main(String[] args) {
        SpringApplication.run(XinfengApplication.class, args);
    }

}
