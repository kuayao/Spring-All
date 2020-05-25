package com.springcloud.memberserviceopenfeignhystrix.controller;


import com.springcloud.memberserviceopenfeignhystrix.client.MessageService;
import com.springcloud.memberserviceopenfeignhystrix.entity.CallbackResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author kuayao
 * @create 2020-05-25 10:56 上午
 */
@RestController
public class MemberConrtoller {

    @Resource
    private MessageService messageService;

    @GetMapping("/snb")
    public String sendNewBook(String mobile, String bookname) {
        String message = "[HOTBOOK}您预约的" + bookname + "已到货，明日将送到您的地址";
        CallbackResult result = messageService.sendSMS(mobile,message);
        if (result.getCode().equals("0")) {
            return "短信已成功送达，服务返回：" + result.getResult();
        } else {
            return "短信发送失败，失败原因：" + result.getResult();

        }
    }



}