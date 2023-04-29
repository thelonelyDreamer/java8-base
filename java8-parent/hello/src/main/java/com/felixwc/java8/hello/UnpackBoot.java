package com.felixwc.java8.hello;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Logger;

/**
 * @author 23167
 * @description Java is the best language
 * @date 2023/3/30--@16:51
 */
public class UnpackBoot {
    public static void main(String[] args) {
        Logger global = Logger.getGlobal();
        System.out.println(global.getName());

        new Thread(()->{
           Thread threadA = new Thread(()->{
               int i = 1;
               while (true){
                   LockSupport.park();
                   System.out.println("A"+i);
                   i++;
               }

           });
           threadA.start();
           new Thread(()->{
               try {
                   while (true){
                       LockSupport.unpark(threadA);
                       TimeUnit.SECONDS.sleep(1);
                   }
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }).start();
       }).start();
    }
}
