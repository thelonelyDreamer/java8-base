package com.felixwc.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * in order to learn java!
 * created at 2022/7/3 20:34
 *
 * @author felixwc
 */
public class CyclicBarrierDemo1 {
    private static CyclicBarrier c = new CyclicBarrier(2);

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            int finalI = i;
            new Thread(()->{
                try {
                    c.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (BrokenBarrierException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(finalI);
            },String.valueOf(i)).start();
        }
    }
}
