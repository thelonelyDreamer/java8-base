package com.felixwc.java8.concurrent.problem.problem;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * in order to learn java!
 * created at 2022/6/22 13:12
 *
 * @author felixwc
 */
public class Demo {
    private static ReadWriteLock lock = new ReentrantReadWriteLock();


    private static class MyThread extends Thread{
        @Override
        public void run() {
            try{
                lock.writeLock().lock();
            }finally {
                lock.readLock().lock();
                lock.writeLock().unlock();
            }
            try{

            }finally {
                lock.readLock().unlock();
            }
        }
    }
}
