package com.felixwc;

import java.util.concurrent.CountDownLatch;

/**
 * in order to learn java!
 * created at 2022/9/27 13:47
 *
 * @author felixwc
 */
public class StringObject {
    private static int a =0;
    public static void main(String[] args) throws InterruptedException {
        String s1 = new String("abc");
        String s2 = new String("abc");
        CountDownLatch countDownLatch = new CountDownLatch(2);
        new Thread(()->{
            synchronized (s1.intern()){
                for (int i = 0; i < 100000; i++) {
                    a++;
                }
            }
            countDownLatch.countDown();
        }).start();
        new Thread(()->{
            synchronized (s2.intern()){
                for (int i = 0; i < 100000; i++) {
                    a++;
                }
            }
            countDownLatch.countDown();
        }).start();
        countDownLatch.await();
        System.out.println(a);
    }
    // string.intern()也是一个string对象,存在于字符串常量池中
}
