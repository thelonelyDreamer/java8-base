package com.felixwc.java8.concurrent.lock.reentrantlock;

/**
 * in order to learn java!
 * created at 2022/2/13 19:40
 *
 * @author wangchao
 */

import java.util.concurrent.locks.ReentrantLock;

/**
 * 演示获取持有锁的数量
 */
public class Demo3 {
    private static class MyService{
        private ReentrantLock lock =new ReentrantLock(true);
        public void testMethod1(){
            System.out.println("A "+lock.getHoldCount());
            lock.lock();
            System.out.println("B "+lock.getHoldCount());
            testMethod2();
            System.out.println("F "+lock.getHoldCount());
            lock.unlock();
            System.out.println("G "+lock.getHoldCount());
        }
        public void testMethod2(){
            System.out.println("C "+lock.getHoldCount());
            lock.lock();
            System.out.println("D "+lock.getHoldCount());
            lock.unlock();
            System.out.println("E "+lock.getHoldCount());
        }
    }
    public static void main(String[] args) {
        new MyService().testMethod1();
    }

}
