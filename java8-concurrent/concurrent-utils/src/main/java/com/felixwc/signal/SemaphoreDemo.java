package com.felixwc.signal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * in order to learn java!
 * created at 2022/7/3 13:35
 *
 * @author felixwc
 */
public class SemaphoreDemo {
    private static final int THREAD_COUNT=30;
    private static final ExecutorService EXECUTOR_SERVICE = Executors.newFixedThreadPool(THREAD_COUNT);
    private static Semaphore semaphore = new Semaphore(10);

    public static void main(String[] args) {
        for (int i = 0; i < THREAD_COUNT; i++) {
            int temp = i;
            EXECUTOR_SERVICE.execute(()->{
                try {
                    semaphore.acquire();
                    System.out.println("save data"+ temp);
                    Thread.sleep(1000);
                    System.out.println(semaphore.getQueueLength());
                    semaphore.release();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        EXECUTOR_SERVICE.shutdown();
    }
}
