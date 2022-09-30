package com.felixwc.java8.juc.key.violent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;

/**
 * in order to learn java!
 * created at 2021/11/28 20:53
 *
 * @author wangchao
 */
public class HelloViolent {
    private static volatile int num = 1;


    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        CountDownLatch countDownLatch = new CountDownLatch(10);
        Runnable runnable = () -> {
            for (int i = 0; i < 10000; i++) {
                lock.lock();
                num++;
                lock.unlock();
            }
            countDownLatch.countDown();
        };

        for (int i = 1; i <= 10; i++) {
            new Thread(runnable).start();
        }

        countDownLatch.await();
        System.out.println(num);
    }

}
