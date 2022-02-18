package com.felixwc.java8.job.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * in order to learn java!
 * created at 2022/1/19 04:22
 *
 * @author wangchao
 */
public class TimerTest {

    public static void demo1(){
        Timer timer = new Timer();
        for (int i = 0; i < 3; i++) {
            MyTimerTask myTimerTask = new MyTimerTask("task" + i);
            timer.schedule(myTimerTask,new Date(),2000);
        }
    }

    public static void main(String[] args) {
        demo1();

    }

    private static class MyTimerTask extends TimerTask {
        private String name;

        public MyTimerTask(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("name:"+name+",start time:"+new Date());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
