package com.springcloud.memberservicehystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springcloud.memberservicehystrix.entity.CallbackResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author kuayao
 * @create 2020-05-25 10:56 上午
 */
@RestController
public class MemberConrtoller {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/snb")
    @HystrixCommand(fallbackMethod = "sendNewBookError")
    public String sendNewBook(String mobile, String bookname) {
        String message = "[HOTBOOK}您预约的" + bookname + "已到货，明日将送到您的地址";
        CallbackResult result = restTemplate.getForObject("http://message-service:8080/sendsms?mobile=" + mobile + "&message=" + message, CallbackResult.class);
        if (result.getCode().equals("0")) {
            return "短信已成功送达，服务返回：" + result.getResult();
        } else {
            return "短信发送失败，失败原因：" + result.getResult();

        }
    }

    public String sendNewBookError(String mobile, String bookname) {
        return "短信发送失败，失败原因：消息服务无法正常运行，请稍后重试！";
    }


}