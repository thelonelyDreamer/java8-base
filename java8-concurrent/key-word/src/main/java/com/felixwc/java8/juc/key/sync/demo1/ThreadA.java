package com.felixwc.java8.juc.key.sync.demo1;

/**
 * in order to learn java!
 * created at 2022/1/25 00:03
 *
 * @author wangchao
 */
public class ThreadA extends Thread{
    private Service service;
    public ThreadA(Service service){
        this.service =service;
    }

    @Override
    public void run() {
        service.printA();
    }
}
