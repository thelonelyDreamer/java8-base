package com.felixwc.java8.concurrent.problem.test;

import com.felixwc.java8.concurrent.problem.console.ExecuteRunnable;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Random;

import static org.junit.Assert.*;

public class ResourceTest{
    @Test
    public void test1() throws InterruptedException {
        LinkedList<Runnable> list = new LinkedList<>();
        Resource resource = new Resource();
        list.add(()->{
            System.out.println(Thread.currentThread().getName());
            resource.setArr(1,new Random().nextInt(10));
            resource.setArr(0,new Random().nextInt(10));
            resource.setArr(2,new Random().nextInt(10));
            System.out.println("设置结束");
        });
        list.add(()->{
            System.out.println(Thread.currentThread().getName());
            System.out.println(resource.getArr(1));
            System.out.println("读取结束");
        });

        ExecuteRunnable.executeBatchRunnable(list);

    }

}