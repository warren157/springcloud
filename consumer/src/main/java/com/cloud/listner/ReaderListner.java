package com.cloud.listner;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * @author rui.wang
 * @version 1.0
 * @description: TODO
 * @date 2021/5/11 14:53
 */

public class ReaderListner implements ApplicationListener<MovieEnvent> {

    private String name;
    public ReaderListner(String name) {
        this.name = name;
    }


    @Override
    public void onApplicationEvent(MovieEnvent movieEnvent) {
        String name = movieEnvent.getSource().toString();
        this.update(name);
    }

    private void update(String movieName) {
        System.out.printf("我是读者：%s，文章已更新为：%s\n", this.name, movieName);
    }

}
