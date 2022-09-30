package com.felixwc.pc1;

import com.felixwc.pc1.obj.Plate;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;

public class DemoTest {


    @Test
    public void test() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(() -> {
            Demo.test();
            countDownLatch.countDown();
        }).start();
        countDownLatch.await();
    }

    @Test
    public void test1() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(() -> {
            Demo.test1(new Plate());
            countDownLatch.countDown();
        }).start();
        countDownLatch.await();
    }


}