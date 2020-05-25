package com.springcloud.memberserviceopenfeignhystrix.client;

import com.springcloud.memberserviceopenfeignhystrix.client.fallback.MessageServiceFallBack;
import com.springcloud.memberserviceopenfeignhystrix.entity.CallbackResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author kuayao
 * @create 2020-05-25 12:27 下午
 */
@FeignClient(name = "message-service",fallback = MessageServiceFallBack.class)
public interface MessageService {

    @GetMapping("/sendsms")
    public CallbackResult sendSMS(@RequestParam("mobile") String mobile,@RequestParam("message") String message);
}
