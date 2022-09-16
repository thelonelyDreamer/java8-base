package com.felixwc.concurrent.rpc;

import org.junit.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * in order to learn java!
 * created at 2022/9/14 14:51
 *
 * @author felixwc
 */
public class Demo1 {
    public static String rpc(Integer time,String ret){
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            ret = null;
            throw new RuntimeException(e);
        }
        return ret;
    }

    @Test
    public void test(){
        // 同步调用
        long start = System.currentTimeMillis();
        rpc(2,"one");
        rpc(3,"two");
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    @Test
    public void test1() throws ExecutionException, InterruptedException {
        // 异步调用
        long start = System.currentTimeMillis();
        CompletableFuture<String> one = CompletableFuture.supplyAsync(() -> rpc(2, "one"));
        CompletableFuture<String> two = CompletableFuture.supplyAsync(() -> rpc(3, "two"));
        CompletableFuture<String> stringCompletableFuture = one.thenCombine(two, (o1, o2) -> o1 + ":" + o2);
        stringCompletableFuture.get();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
