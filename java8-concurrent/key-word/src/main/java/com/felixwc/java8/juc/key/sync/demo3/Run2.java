package com.felixwc.java8.juc.key.sync.demo3;

/**
 * in order to learn java!
 * created at 2022/1/25 01:00
 *
 * @author wangchao
 */
public class Run2 {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        threadA.setName("a");

        ThreadB threadB = new ThreadB(myService);
        threadB.setName("b");

        threadA.start();
//        Thread.sleep(50);
        threadB.start();
        /* 执行结果 对象一旦改变，锁会失效
            a begin 1643043754984
            b begin 1643043755024
            a end 1643043757984
            b end 1643043758024
         */
    }
}
