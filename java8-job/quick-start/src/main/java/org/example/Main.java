package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class);
        String s = "ss";
        logger.info("{}",s);
        Timer timer = new Timer();
//        timer.scheduleAtFixedRate(new MyTask(), 0L, 2000);
        timer.schedule(new MyTask(),0,2000L);
    }

    private static class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println(new Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}