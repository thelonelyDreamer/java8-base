package com.felixwc.java8.concurrent.console;

import java.util.List;
import java.util.concurrent.*;

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

    public static <V> V executeTask(ForkJoinTask<V> test) throws ExecutionException, InterruptedException {
        ForkJoinTask<V> testForkJoinTask = pool.submit(test);
        V v = testForkJoinTask.get();
        return v;
    }

    public static  void executeRunnableBatch(List<Runnable> list) throws InterruptedException {
        ForkJoinPool forkJoinPool = pool;
        for (Runnable runnable : list) {
            forkJoinPool.submit(runnable);
        }
        pool.shutdown();
        pool.awaitTermination(10, TimeUnit.MINUTES);
    }
}
