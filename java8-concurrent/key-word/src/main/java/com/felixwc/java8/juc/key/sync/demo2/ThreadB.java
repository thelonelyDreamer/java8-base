package com.felixwc.java8.juc.key.sync.demo2;

/**
 * in order to learn java!
 * created at 2022/1/25 00:37
 *
 * @author wangchao
 */
public class ThreadB extends Thread{
    private Service service;
    private UserInfo userInfo;

    public ThreadB(Service service, UserInfo userInfo) {
        this.service = service;
        this.userInfo = userInfo;
    }

    @Override
    public void run() {
        service.serviceMethodA(userInfo);
    }
}
