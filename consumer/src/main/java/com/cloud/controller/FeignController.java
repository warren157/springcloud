package com.cloud.controller;

import com.cloud.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rui.wang
 * @version 1.0
 * @description: TODO
 * @date 2021/4/28 16:50
 */
@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    @Qualifier("feignService")
    private FeignService feignService;

    @GetMapping("/getPort")
    public String getPort(){return feignService.getPort();}

}
