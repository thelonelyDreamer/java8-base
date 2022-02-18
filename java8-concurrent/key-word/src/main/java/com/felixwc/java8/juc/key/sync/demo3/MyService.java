package com.felixwc.java8.juc.key.sync.demo3;

/**
 * in order to learn java!
 * created at 2022/1/25 00:55
 *
 * @author wangchao
 */
public class MyService {
    private String lock = "123";

    public void testMethod() {
        synchronized (lock) {
            try {
                System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
                lock = "456";
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName() + " end " + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
