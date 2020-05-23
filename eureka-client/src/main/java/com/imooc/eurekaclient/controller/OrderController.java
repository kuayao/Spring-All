package com.imooc.eurekaclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author kuayao
 * @create 2020-05-23 5:38 下午
 */
@Controller
public class OrderController {

    @GetMapping("/order/{id}")
    @ResponseBody
    public String findById(@PathVariable("id") Integer orderId){
        if (orderId == 1){
            return "{\"id\":1.\"title\":\"Test Order 1 \"}";
        }else {
             return null;
        }
    }

}
