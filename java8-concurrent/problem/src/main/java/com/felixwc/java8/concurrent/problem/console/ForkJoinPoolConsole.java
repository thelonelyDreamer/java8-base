package com.felixwc.java8.concurrent.problem.console;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * in order to learn java!
 * created at 2021/8/20 18:36
 *
 * @author wangchao
 */

public class ForkJoinPoolConsole {
    private static ForkJoinPool pool;
    private static int computerCore = 4;

    static {
        computerCore = Runtime.getRuntime().availableProcessors();
        System.out.println("computerCore:"+computerCore);
        pool = new ForkJoinPool(computerCore);
    }

    public static <V> V executeTask(Callable<V> test) throws ExecutionException, InterruptedException {
        ForkJoinTask<V> testForkJoinTask = pool.submit(test);
        V v = testForkJoinTask.get();
        return v;
    }

}
