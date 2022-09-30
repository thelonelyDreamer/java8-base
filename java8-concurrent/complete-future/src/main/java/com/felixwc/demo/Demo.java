package com.felixwc.demo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * in order to learn java!
 * created at 2022/9/27 12:23
 *
 * @author felixwc
 */
public class Demo {
    public static void test() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(1);
            return "hello";
        });
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(2);
            return "world";
        });
        CompletableFuture<Object> future = CompletableFuture.anyOf(future1, future2);
        future.get();
        System.out.println(3);
    }

    public static void main(String[] args) throws Exception{
        System.out.println(Thread.currentThread().isDaemon());
        test();
    }
}
