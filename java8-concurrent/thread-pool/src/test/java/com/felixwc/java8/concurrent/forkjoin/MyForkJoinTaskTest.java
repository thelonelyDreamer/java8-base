package com.felixwc.java8.concurrent.forkjoin;

import com.felixwc.java8.concurrent.console.ForkJoinPoolConsole;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.ExecutionException;

public class MyForkJoinTaskTest {

    @Test
    public void test1() throws ExecutionException, InterruptedException {
        Integer integer = ForkJoinPoolConsole.executeTask(new MyForkJoinTask(10, 1000));
        Assert.assertTrue(integer==(10+1000)/2*991);
    }
}