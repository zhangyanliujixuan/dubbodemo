package com.atguigu.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class HelloController {

    @Reference //引用远程服务对象，进行远程调用
    HelloService helloService;//代理对象
    @RequestMapping("/hello")
    public String sayHello(String name){

        String s = helloService.sayHello(name);//调用远程接口 ，RPC
        return s;
    }
}
