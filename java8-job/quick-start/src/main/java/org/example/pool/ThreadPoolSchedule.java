package org.example.pool;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * in order to learn java!
 * created at 2022/7/29 03:41
 *
 * @author felixwc
 */
public class ThreadPoolSchedule {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
        scheduledExecutorService.scheduleAtFixedRate(()->{
            try {
                System.out.println(new Date());
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },0,1, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(()->{
            try {
                System.out.println(new Date());
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },0,1, TimeUnit.SECONDS);
    }
}
