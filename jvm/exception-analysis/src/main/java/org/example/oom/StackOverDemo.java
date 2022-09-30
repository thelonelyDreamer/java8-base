package org.example.oom;

import java.util.concurrent.TimeUnit;

/**
 * in order to learn java!
 * created at 2022/9/27 14:56
 *
 * @author felixwc
 */
public class StackOverDemo {
    public static void main(String[] args) {

        new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
        test(10000000);
    }

    public static void test(int n){
        if(n==1) return;
        test(n-1);
    }
}
