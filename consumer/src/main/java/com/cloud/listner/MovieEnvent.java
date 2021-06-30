package com.cloud.listner;

import org.springframework.context.ApplicationEvent;

/**
 * @author rui.wang
 * @version 1.0
 * @description: TODO
 * @date 2021/5/11 14:55
 */
public class MovieEnvent extends ApplicationEvent {

    public MovieEnvent(String movieName) {
        super(movieName);
    }
}
