package com.felixwc.java8.concurrent.resource.number;

import com.felixwc.java8.concurrent.poolgenerator.PoolGeneratorUtils;
import org.junit.After;
import org.junit.Test;

import java.util.concurrent.ThreadPoolExecutor;

import static org.junit.Assert.*;

public class NumberConcurrentTest {
    NumberResource numberResource;
    @Test
    public void test1() throws InterruptedException {
        numberResource = new NumberResource(0);
        System.out.println(numberResource.getNumber());
        ThreadPoolExecutor threadPoolExecutor = PoolGeneratorUtils.getThreadPoolExecutor();
        for(int i =0;i<10;i++) threadPoolExecutor.execute(new NumberAdd10000().setId(i).setResource(numberResource));
        for(int i =0;i<10;i++) threadPoolExecutor.execute(new NumberSub1000().setId(i+10).setResource(numberResource));
        Thread.sleep(5*1000);
        System.out.println(numberResource.getNumber());
    }

    @After
    public void afterMethod() throws InterruptedException {
        Thread.sleep(5*1000);
        System.out.println(numberResource.getNumber());
    }
}