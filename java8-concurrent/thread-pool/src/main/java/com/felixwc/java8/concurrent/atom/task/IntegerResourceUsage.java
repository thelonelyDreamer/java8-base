package com.felixwc.java8.concurrent.atom.task;

import com.felixwc.java8.concurrent.atom.IntegerResource;

/**
 * in order to learn java!
 * created at 2021/8/22 15:55
 *
 * @author wangchao
 */
public class IntegerResourceUsage implements Runnable {
    private IntegerResource resource;

    public IntegerResourceUsage(IntegerResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        System.out.println("线程启动：" + Thread.currentThread().getName());
        for(int i=0;i<10000;i++)
        resource.addNum(1);
        System.out.println(Thread.currentThread().getName()+resource.getNum());
    }
}
