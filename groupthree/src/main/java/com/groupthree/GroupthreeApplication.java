package com.groupthree;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.groupthree.Controller")
@MapperScan("com.groupthree.dao")
public class GroupthreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroupthreeApplication.class, args);
	}

}
