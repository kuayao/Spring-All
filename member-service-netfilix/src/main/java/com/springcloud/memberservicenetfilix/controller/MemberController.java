package com.springcloud.memberservicenetfilix.controller;

import com.springcloud.memberservicenetfilix.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author kuayao
 * @create 2020-05-24 3:59 下午
 */
@Controller
public class MemberController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/borrow")
    @ResponseBody
    public  String borrow(String sn){
        /*
            RestTemplate负载均衡格式要求：
            http://微服务id/webapi地址
        */
       Book book = restTemplate.getForObject("http://book-service/bsn?sn="+sn, Book.class);
       return book.getName()+":"+book.getDesc()+"图书借阅成功";
    }
}
