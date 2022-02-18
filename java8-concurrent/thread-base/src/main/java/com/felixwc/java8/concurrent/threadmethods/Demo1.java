package com.felixwc.java8.concurrent.threadmethods;

/**
 * in order to learn java!
 * created at 2022/2/16 22:15
 *
 * @author wangchao
 */

/**
 * holdsLock(Object o) 判断当前线程是否具有锁
 */
public class Demo1 {
    public static void main(String[] args) {
        System.out.println("A "+Thread.currentThread().holdsLock(Demo1.class));
        synchronized (Demo1.class){
            System.out.println("B "+Thread.currentThread().holdsLock(Demo1.class));
        }
        System.out.println("C "+Thread.currentThread().holdsLock(Demo1.class));
    }
}
