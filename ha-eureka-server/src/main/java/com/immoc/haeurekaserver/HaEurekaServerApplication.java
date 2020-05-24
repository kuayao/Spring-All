package com.immoc.haeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HaEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HaEurekaServerApplication.class, args);
    }

}
