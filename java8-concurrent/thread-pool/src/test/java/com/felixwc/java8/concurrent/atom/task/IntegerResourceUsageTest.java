package com.felixwc.java8.concurrent.atom.task;

import com.felixwc.java8.concurrent.atom.IntegerResource;
import com.felixwc.java8.concurrent.console.ForkJoinPoolConsole;
import org.junit.Test;

import java.util.ArrayList;

public class IntegerResourceUsageTest {
    @Test
    public void name() throws InterruptedException {
        IntegerResource resource = new IntegerResource(0);
        ArrayList<Runnable> list = new ArrayList<>();
        for(int i=0;i<50;i++){
            list.add(new IntegerResourceUsage(resource));
        }
        ForkJoinPoolConsole.executeRunnableBatch(list);
        System.out.println(resource.getNum());
    }
}