package com.xu.consumer.controller;

import com.xu.provider.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther xuyaohui
 * @date 2018/11/1
 */

@RestController
public class TestController {

    @Autowired
    ConsumerService consumerService;

    @GetMapping("/hello")
    public String hello(){

        return consumerService.test() +"恭喜你成功运行DEMO";
    }
}
