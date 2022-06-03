package com.felixwc;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            LockSupport.park();
            printInfo();
        },"t1");
        Thread t2 = new Thread(()->{
            printInfo();
            LockSupport.unpark(t1);
        },"t2");
        t2.start();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void printInfo(){
        System.out.println(Thread.currentThread().getName()+"---start");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+"---end");
    }
}