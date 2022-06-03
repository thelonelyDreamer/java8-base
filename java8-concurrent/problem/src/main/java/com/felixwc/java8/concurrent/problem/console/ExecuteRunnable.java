package com.felixwc.java8.concurrent.problem.console;

import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/**
 * in order to learn java!
 * created at 2021/8/20 17:41
 *
 * @author wangchao
 */
public class ExecuteRunnable {
    public static void executeBatchRunnable(List<Runnable> list) throws InterruptedException {
        LinkedBlockingDeque<Runnable> queue = new LinkedBlockingDeque<>();
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(4,10,
                1000,TimeUnit.MILLISECONDS,queue);
        list.stream().forEach(poolExecutor::execute);

        poolExecutor.awaitTermination(10,TimeUnit.SECONDS);
        poolExecutor.shutdown();
        LockSupport.park(Thread.currentThread());
    }
}
