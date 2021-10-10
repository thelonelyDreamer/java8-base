package com.felixwc.java8.concurrent.resource.number;

import com.felixwc.java8.concurrent.console.ExecuteRunnable;
import org.junit.Test;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

public class ANumberAdd10000Test {
    private int resource;
    @Test
    public void test1() throws InterruptedException {
        LinkedList<Runnable> runnables = new LinkedList<Runnable>();
        for(int i =0;i<20;i++) runnables.add(new ANumberAdd10000(i));
        ExecuteRunnable.executeBatchRunnable(runnables);
        TimeUnit.SECONDS.sleep(5);
        System.out.println(resource);
    }
}