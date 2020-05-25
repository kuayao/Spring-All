package com.springcloud.messageservicehystrix.controller;

import com.springcloud.messageservicehystrix.entity.CallbackResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author kuayao
 * @create 2020-05-25 10:45 上午
 */
@RestController
public class MessageController {


    /**
     * 模拟发送短信
     * @param mobile 手机号
     * @param message 发送内容
     * @return 处理标识
     */
    @GetMapping("/sendsms")
    public CallbackResult sendSms(String mobile,String message){
        int soconds = new Random().nextInt(3000);
        try {
            Thread.sleep(soconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new CallbackResult("0","SUCCESS");
    }

}
