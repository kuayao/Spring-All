package com.springcloud.bookservicenetfilix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BookServiceNetfilixApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookServiceNetfilixApplication.class, args);
    }

}
