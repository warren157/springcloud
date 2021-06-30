package com.cloud.service;

import com.cloud.fallback.CustomerFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author rui.wang
 * @version 1.0.0
 * @ClassName FeignService.java
 * @Description TODO
 * @createTime 2021年04月28日 16:57:00
 */
@FeignClient(name = "sentinel" ,fallback = FeignServiceImpl.class)
public interface FeignService {

    @RequestMapping(value="/nacos/getPort",method = RequestMethod.GET)
    public String getPort();

}
