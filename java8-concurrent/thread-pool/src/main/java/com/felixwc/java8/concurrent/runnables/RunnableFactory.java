package com.felixwc.java8.concurrent.runnables;

import java.util.Date;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/**
 * in order to learn java!
 * created at 2021/8/20 14:56
 *
 * @author wangchao
 */
public class RunnableFactory {
    private static Runnable example;
    private static LinkedList<Runnable> examples;
    private static boolean flag;

    private static synchronized void initExamples(int n){
        if(null==examples){
            examples = new LinkedList<Runnable>();
            for(int i=0;i<n;i++)
                examples.add(()->{
                    System.out.println("正在执行 " + Thread.currentThread().getName() + new Date());
                    try {
                        TimeUnit.MILLISECONDS.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("结束 " + Thread.currentThread().getName() + new Date());
                });
            flag = true;
        }
    }

    public static boolean isFlag() {
        return flag;
    }

    public static synchronized Runnable getExample() {
        if(null==example){
            example = new Runnable() {
                @Override
                public void run() {
                    System.out.println("正在执行 " + Thread.currentThread().getName() + new Date());
                    try {
                        TimeUnit.MILLISECONDS.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("结束 " + Thread.currentThread().getName() + new Date());
                }
            };
        }
        return example;
    }

    public static LinkedList<Runnable> getExamples() {
        while (!flag){
            initExamples(300);
        }
        return examples;
    }
}
