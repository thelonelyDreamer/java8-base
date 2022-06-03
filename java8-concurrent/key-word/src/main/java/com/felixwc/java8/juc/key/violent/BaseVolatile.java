package com.felixwc.java8.juc.key.violent;

import java.util.concurrent.CountDownLatch;

/**
 * in order to learn java!
 * created at 2022/6/2 15:08
 *
 * @author felixwc
 */
public class BaseVolatile {
    private volatile static int a=0;
    private static CountDownLatch count= new CountDownLatch(100);
    public static void main(String[] args) throws InterruptedException {
        for(int i =0;i<100;i++){
            new Thread(()-> {
                for (int j = 0; j < 100; j++) {
                    a++;
                }
                count.countDown();
            }).start();
        }
        count.await();
        System.out.println(a);
    }
}
