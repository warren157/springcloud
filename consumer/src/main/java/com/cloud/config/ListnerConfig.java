package com.cloud.config;

import com.cloud.listner.MovieEnvent;
import com.cloud.listner.ReaderListner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author rui.wang
 * @version 1.0
 * @description: TODO
 * @date 2021/5/11 14:53
 */
@Configuration
public class ListnerConfig {

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext context) {
        CommandLineRunner runner = new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                context.publishEvent(new MovieEnvent("好看的电影"));
            }
        };
        return runner;
    }

    @Bean
    public ReaderListner r1(){return new ReaderListner("张三");}


    @Bean
    public ReaderListner r2(){return new ReaderListner("李四");}
}
