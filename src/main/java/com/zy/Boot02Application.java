package com.zy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//开启事务
@EnableTransactionManagement
public class Boot02Application {

    public static void main(String[] args) {

        SpringApplication.run(Boot02Application.class, args);
    }

}
