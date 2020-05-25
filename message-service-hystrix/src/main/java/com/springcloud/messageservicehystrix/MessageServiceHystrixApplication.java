package com.springcloud.messageservicehystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MessageServiceHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessageServiceHystrixApplication.class, args);
    }

}
