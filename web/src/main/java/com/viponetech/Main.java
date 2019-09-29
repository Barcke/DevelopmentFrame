package com.viponetech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @ProjectName developmentFrame
 * @ClassName com.viponetech.Main
 * @Description TODO
 * @Author Administrator
 * @Date 2019/9/29 14:23
 * @Version 1.0
 **/
@SpringBootApplication
@MapperScan("com.viponetech.mappers")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}
