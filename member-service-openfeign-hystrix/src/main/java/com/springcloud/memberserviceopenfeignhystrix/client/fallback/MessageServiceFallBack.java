package com.springcloud.memberserviceopenfeignhystrix.client.fallback;

import com.springcloud.memberserviceopenfeignhystrix.client.MessageService;
import com.springcloud.memberserviceopenfeignhystrix.entity.CallbackResult;
import org.springframework.stereotype.Component;

/**
 * @author kuayao
 * @create 2020-05-25 12:47 下午
 */
@Component
public class MessageServiceFallBack implements MessageService {

    @Override
    public CallbackResult sendSMS(String mobile, String message) {
        return new CallbackResult("INVALID_SERVICE","消息服务暂时无法使用，短信发送失败");
    }
}
