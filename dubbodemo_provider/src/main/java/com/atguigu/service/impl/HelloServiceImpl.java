package com.atguigu.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.service.HelloService;

@Service  //是Dubbo框架提供的注解，用于发布指定的服务中心
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello"+name;
    }
}
