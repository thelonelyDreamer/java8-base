package org.example.timer;

/**
 * in order to learn java!
 * created at 2022/2/14 23:16
 *
 * @author wangchao
 */

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 验证Timer类中cancel()方法的使用,但是不是绝对的取消
 */
public class Demo3 {
    private static class MyTask extends TimerTask{
        private int i;

        public MyTask(int i) {
            this.i = i;
        }

        @Override
        public void run() {
            System.out.println("第 "+i+" 次没有被cancel取消");
        }
    }
    public static void main(String[] args) {
        int i=0;
        long nowTime = System.currentTimeMillis();
        System.out.println("当前时间为："+nowTime);
        System.out.println("计划时间为："+nowTime);
        while (true){
            i++;
            Timer timer = new Timer();
            MyTask myTask = new MyTask(i);
            timer.schedule(myTask,new Date(nowTime));
            timer.cancel();
        }
    }
}
