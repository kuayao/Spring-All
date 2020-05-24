package com.springcloud.memberservicenetfilix;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class MemberServiceNetfilixApplication {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();

    }
    @Bean
    public IRule ribbonRule(){
        return new RoundRobinRule();
        }

    public static void main(String[] args) {
        SpringApplication.run(MemberServiceNetfilixApplication.class, args);
    }

}
