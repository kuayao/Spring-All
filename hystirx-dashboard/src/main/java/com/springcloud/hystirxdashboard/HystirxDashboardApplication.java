package com.springcloud.hystirxdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
    @EnableHystrixDashboard
public class HystirxDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystirxDashboardApplication.class, args);
    }

}
