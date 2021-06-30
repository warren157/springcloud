package com.cloud.sentinel;

/**
 * @author rui.wang
 * @version 1.0
 * @description: TODO
 * @date 2021/4/28 15:20
 */
public class CustomerFallback {
    public static String fallbackMethod(Throwable e) {
        return "限流请求连接(Java类异常)的兜底方法：" + e.getMessage();
    }
}
