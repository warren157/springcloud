package com.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author rui.wang
 * @version 1.0
 * @description: TODO
 * @date 2021/4/28 16:42
 */
@Service
public class FeighServiceImpl implements  FeighService{

    @Value("${server.port}")
    private Integer port;
    @Override
    public String getPort() {
        return port+"";
    }
}
