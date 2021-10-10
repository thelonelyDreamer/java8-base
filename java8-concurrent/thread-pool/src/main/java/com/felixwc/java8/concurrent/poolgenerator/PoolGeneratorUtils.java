package com.felixwc.java8.concurrent.poolgenerator;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * in order to learn java!
 * created at 2021/8/20 14:38
 *
 * @author wangchao
 */
public class PoolGeneratorUtils {
    private static ThreadPoolExecutor poolExecutor;

    public static synchronized ThreadPoolExecutor getThreadPoolExecutor(){
        if(null==poolExecutor) {
            LinkedBlockingDeque<Runnable> queue = new LinkedBlockingDeque<>();
            poolExecutor = new ThreadPoolExecutor(4,10,1000,TimeUnit.MILLISECONDS,queue);
        }
        return poolExecutor;
    }

}
