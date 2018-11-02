package com.xu.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xu.provider.service.TestService;

/**
 * @auther xuyaohui
 * @date 2018/11/1
 */
@Service
public class TestServiceImpl implements TestService{

    @Override
    public String hello() {
        return "hello ...";
    }
}
