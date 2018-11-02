package com.xu.provider.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * @auther xuyaohui
 * @date 2018/11/1
 */

@Component
public class ConsumerService {

    @Reference
    TestService testService;

    public String test(){

        return testService.hello();
    }
}
