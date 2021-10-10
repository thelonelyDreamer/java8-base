package com.felixwc.java8.concurrent.runnables;

/**
 * in order to learn java!
 * created at 2021/8/20 16:36
 *
 * @author wangchao
 */
public class DemoRunnableFactory {
    private static DemoRunnable runnable = new DemoRunnable("counter");

    static {
        runnable = new DemoRunnable("li");
    }

    {
        runnable = new DemoRunnable("si");
    }

    public static DemoRunnable getRunnable() {
        return runnable;
    }
}
