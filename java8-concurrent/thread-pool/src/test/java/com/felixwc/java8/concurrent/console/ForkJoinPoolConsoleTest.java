package com.felixwc.java8.concurrent.console;

import com.felixwc.java8.concurrent.callable.DealDataCallable;
import org.junit.Test;

import java.util.concurrent.ExecutionException;

public class ForkJoinPoolConsoleTest {

    @Test
    public void test1() throws ExecutionException, InterruptedException {
        Integer integer = ForkJoinPoolConsole.executeTask(new DealDataCallable<Integer>(5));
        System.out.println(integer);
    }

}