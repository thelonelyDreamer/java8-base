package com.felixwc.java8.juc.key.sync.demo3;

import lombok.AllArgsConstructor;

/**
 * in order to learn java!
 * created at 2022/1/25 00:59
 *
 * @author wangchao
 */
@AllArgsConstructor
public class ThreadB extends Thread{
    private MyService myService;

    @Override
    public void run() {
        myService.testMethod();
    }
}
