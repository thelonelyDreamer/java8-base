package com.felixwc.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * in order to learn java!
 * created at 2022/7/3 20:34
 *
 * @author felixwc
 */
public class CyclicBarrierDemo2 {
    private static CyclicBarrier c = new CyclicBarrier(2, new A());
    // 到达屏障时，先执行线程A,故输出结果3在前面，后面两个任意
    public static void main(String[] args) {
        new Thread(() -> {
            try {
                c.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
            System.out.println(1);
        }).start();
        try {
            c.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
        System.out.println(2);
    }

    private static class A implements Runnable {

        @Override
        public void run() {
            System.out.println(3);
        }
    }
}
