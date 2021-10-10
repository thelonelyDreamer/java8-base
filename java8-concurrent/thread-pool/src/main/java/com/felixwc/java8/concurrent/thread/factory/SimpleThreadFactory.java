package com.felixwc.java8.concurrent.thread.factory;

import java.util.concurrent.ThreadFactory;

/**
 * in order to learn java!
 * created at 2021/8/22 19:08
 *
 * @author wangchao
 */
public class SimpleThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setPriority(Thread.currentThread().getPriority());
        return thread;
    }
}
