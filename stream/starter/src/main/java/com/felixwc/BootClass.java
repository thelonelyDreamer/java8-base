package com.felixwc;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * in order to learn java!
 * created at 2022/4/11 14:56
 *
 * @author wangchao
 */
public class BootClass {
    private static AtomicInteger i=new AtomicInteger(1);
    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer();
        timer.schedule(new MyTask(),1000);
        timer.schedule(new MyTask(),1000);
        timer.schedule(new MyTask(),1000);
        timer.schedule(new MyTask(),1000);
        timer.schedule(new MyTask(),1000);
        Thread.sleep(30000);
        timer.cancel();
    }

    private static class MyTask extends TimerTask{

        @Override
        public void run() {
            try {
                Thread.sleep(1000*i.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("run myTask " + i.getAndIncrement());
        }
    }
}
