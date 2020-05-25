package com.springcloud.eurekaserverhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerHystrixApplication.class, args);
    }

}
