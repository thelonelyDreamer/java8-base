package com.felixwc.java8.concurrent.lock.reentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * in order to learn java!
 * created at 2022/2/12 20:22
 *
 * @author wangchao
 */
public class Demo1 {
    private static class MyService {
        private Lock lock = new ReentrantLock();

        private void testMethod() {
            lock.lock();
            for (int i = 0; i < 10; i++) {
                System.out.println("ThreadName="+Thread.currentThread().getName()+" "+(i+1));
            }
            lock.unlock();
        }
    }

    private static class MyThread extends Thread{
        private MyService service;

        public MyThread(MyService myService) {
            this.service = myService;
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
