package com.cloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.cloud.FeighService;
import com.cloud.sentinel.CustomerFallback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author rui.wang
 * @version 1.0
 * @description: TODO
 * @date 2021/4/28 14:33
 */
@RestController
@RequestMapping("/nacos")
public class NacosController {

    @Value("${config.info}")
    private String config;

    @GetMapping("/info")
    @SentinelResource(value="info",fallbackClass = CustomerFallback.class,fallback = "fallbackMethod")
    public String info(){

        return config;
    }

    @GetMapping(value = "/hello")
    @SentinelResource(value = "hello",fallbackClass = CustomerFallback.class,fallback = "fallbackMethod")
    public String hello() {

        return "Hello Sentinel";
    }

    int i=0;

    @GetMapping("/circuit")
    @SentinelResource(value="circuitBreaker",fallbackClass = CustomerFallback.class,fallback = "fallbackMethod")
    public String circuitBreaker(){
        i++;
        System.out.println("i="+i);
        if(i%3==0){
            throw new RuntimeException("模拟异常");
        }
        return "message1";
    }

    @Autowired
    FeighService feighService;

    @GetMapping("/getPort")
    public String getPort(){
        return feighService.getPort();
    }
}
