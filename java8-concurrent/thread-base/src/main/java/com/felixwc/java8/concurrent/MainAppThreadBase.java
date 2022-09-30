package com.felixwc.java8.concurrent;

import lombok.extern.slf4j.Slf4j;

/**
 * in order to learn java!
 * created at 2022/2/4 22:51
 *
 * @author wangchao
 */
@Slf4j(topic = "")
public class MainAppThreadBase {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                int i=0;
                while (i < 100000) {
                    i++;
                    System.out.println("i="+i);
                }
                Thread.sleep(10);
                System.out.println("end");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });
        thread.start();
        thread.interrupt();
    }
}
