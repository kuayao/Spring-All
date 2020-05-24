package com.springcloud.eurekaservernetfilix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class EurekaServerNetfilixApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerNetfilixApplication.class, args);
    }

}
