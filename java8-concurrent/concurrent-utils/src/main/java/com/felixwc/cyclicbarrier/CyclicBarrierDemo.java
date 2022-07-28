package com.felixwc.cyclicbarrier;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * in order to learn java!
 * created at 2022/7/3 20:34
 *
 * @author felixwc
 */
public class CyclicBarrierDemo {
    private static AtomicInteger  num = new AtomicInteger(1);
    public static void main(String[] args) {
        System.out.println(num.get());
    }
}
