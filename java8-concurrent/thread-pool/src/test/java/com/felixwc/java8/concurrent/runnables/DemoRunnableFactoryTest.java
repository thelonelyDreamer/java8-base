package com.felixwc.java8.concurrent.runnables;

import org.junit.Assert;
import org.junit.Test;

public class DemoRunnableFactoryTest {

    @Test
    public void test1() {
        DemoRunnable runnable;
        for(int i=0;i<100;i++){
            runnable = DemoRunnableFactory.getRunnable();
            System.out.println(runnable);
        }
        Assert.assertTrue(1==1);
    }
}