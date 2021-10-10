package com.felixwc.java8.concurrent.runnables;

/**
 * in order to learn java!
 * created at 2021/8/20 16:32
 *
 * @author wangchao
 */
public class DemoRunnable implements Runnable {
    private String name;

    public DemoRunnable() {
    }

    public DemoRunnable(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        long count = 0;
        for(long i=0L;i<1E9;i++){
            count+=i;
        }
        System.out.println(name+"："+count);
    }

    @Override
    public String toString() {
        return "DemoRunnable{" +
                "name='" + name + '\'' +
                '}';
    }
}
