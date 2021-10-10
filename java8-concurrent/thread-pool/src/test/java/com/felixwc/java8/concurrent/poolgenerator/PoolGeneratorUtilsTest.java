package com.felixwc.java8.concurrent.poolgenerator;

import com.felixwc.java8.concurrent.runnables.RunnableFactory;
import org.junit.After;
import org.junit.Test;

import java.util.LinkedList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class PoolGeneratorUtilsTest {

    @Test
    public void test1() {
        ThreadPoolExecutor threadPoolExecutor = PoolGeneratorUtils.getThreadPoolExecutor();
        Runnable example = RunnableFactory.getExample();
        threadPoolExecutor.execute(example);
    }
    @Test
    public void test2(){
        ThreadPoolExecutor threadPoolExecutor = PoolGeneratorUtils.getThreadPoolExecutor();
        LinkedList<Runnable> examples = RunnableFactory.getExamples();
        examples.stream().forEach(threadPoolExecutor::execute);
    }

    @After
    public void afterMethod() throws InterruptedException {
        TimeUnit.SECONDS.sleep(30);
    }
}