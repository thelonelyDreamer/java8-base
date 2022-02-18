package com.felixwc.java8.concurrent.priority;

/**
 * in order to learn java!
 * created at 2022/2/4 22:52
 *
 * @author wangchao
 */
public class MyThreadDemo extends Thread{
    private int i;

    public MyThreadDemo(int i) {
        this.i = i;
        this.setName("线程"+String.valueOf(i));
        this.setPriority(i);
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+"begin");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+"end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            new MyThreadDemo(i).start();
        }
    }
}
