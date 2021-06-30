package com.cloud;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * @author rui.wang
 * @version 1.0
 * @description: TODO
 * @date 2021/4/28 16:52
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
        System.out.println(SpringApplication.class.getClassLoader().getResource("META-INF/spring.factories"));
    }

    //随机负载均衡策略
    @Bean
    public IRule randomRule(){return  new RandomRule();}
}
