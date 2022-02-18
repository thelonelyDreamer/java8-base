package com.felixwc.java8.concurrent.lock.reentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * in order to learn java!
 * created at 2022/2/12 21:19
 *
 * @author wangchao
 */

/**
 * 抛出未受检异常会导致死锁
 */
public class Demo2 {
    private static class MyService{
        private Lock lock = new ReentrantLock();
        private String test;
        private void testMethod(){
            lock.lock();
            for (int i = 0; i < 10; i++) {
                System.out.println("ThreadName="+Thread.currentThread().getName()+" "+(i+1));
            }
            test.toLowerCase();
            lock.unlock();
        }
    }
    private static class MyThread extends Thread{
        private MyService service;

        private MyThread(MyService service) {
            this.service = service;
        }

        @Override
        public void run() {
            service.testMethod();
        }
    }
    public static void main(String[] args) {
        MyService myService = new MyService();

        MyThread a1 = new MyThread(myService);
        MyThread a2 = new MyThread(myService);
        MyThread a3 = new MyThread(myService);
        MyThread a4 = new MyThread(myService);
        MyThread a5 = new MyThread(myService);

        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();
    }
}
