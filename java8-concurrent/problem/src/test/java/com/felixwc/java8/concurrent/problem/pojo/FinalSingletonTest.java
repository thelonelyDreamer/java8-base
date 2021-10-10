package com.felixwc.java8.concurrent.problem.pojo;

import com.felixwc.java8.concurrent.problem.console.ExecuteRunnable;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class FinalSingletonTest {
    @Test
    public void test() throws InterruptedException {
        LinkedList<Runnable> list = new LinkedList<>();
        for(int i=0;i<100;i++){
            list.add(()->{
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                FinalSingleton.getSingleton();
            });
        }
        ExecuteRunnable.executeBatchRunnable(list);
    }
}