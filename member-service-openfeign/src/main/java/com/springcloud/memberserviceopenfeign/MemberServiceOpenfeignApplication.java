package com.springcloud.memberserviceopenfeign;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class MemberServiceOpenfeignApplication {

    @Bean
    public IRule ribboonRule(){
        return new RandomRule();
    }
    public static void main(String[] args) {
        SpringApplication.run(MemberServiceOpenfeignApplication.class, args);
    }

}
