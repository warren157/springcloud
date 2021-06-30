package com.cloud.service;

import org.springframework.stereotype.Service;

/**
 * @author rui.wang
 * @version 1.0
 * @description: TODO
 * @date 2021/4/29 9:44
 */
@Service("feignService")
public class FeignServiceImpl implements FeignService{
    @Override
    public String getPort() {
        return "feign error";
    }
}
