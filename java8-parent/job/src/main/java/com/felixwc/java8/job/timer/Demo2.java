package com.felixwc.java8.job.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * in order to learn java!
 * created at 2022/2/14 00:19
 *
 * @author wangchao
 */

/**
 * scheduleAtFixedRate方法具有追赶性质，过去时间的未执行也可以执行
 */
public class Demo2 {
    private static class MyTask extends TimerTask{

        @Override
        public void run() {
            System.out.println("begin timer = "+System.currentTimeMillis());
            System.out.println("  end timer = "+System.currentTimeMillis());
        }
    }

    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        long nowTime = System.currentTimeMillis();
        System.out.println("现在执行时间："+nowTime);
        long runTime=nowTime-20000;
        System.out.println("计划执行时间："+runTime);
        Timer timer = new Timer();
        timer.schedule(myTask,new Date(runTime),2000);
    }
}
