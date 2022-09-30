package com.felixwc.pc1;


import com.felixwc.pc1.obj.Plate;
import com.felixwc.pc1.obj.Product;

import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;

/**
 * in order to learn java!
 * created at 2022/9/23 14:18
 *
 * @author felixwc
 */
public class Demo {

    public static void test(){
        ArrayBlockingQueue<String> strings = new ArrayBlockingQueue<String>(10);
        CountDownLatch countDownLatch = new CountDownLatch(3);
        new Thread(()->{
            try {
                int i=0;
                while (i<100){
                    String poll = strings.take();
                    if(Objects.nonNull(poll)){
                        System.out.println(poll+"===sequence:"+i);
                        i++;
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                countDownLatch.countDown();
            }
        }).start();
        for (int i = 0; i <2; i++) {
            new Thread(()->{
                try {
                    int j =0;
                    while (j<50){
                        strings.put(Thread.currentThread().getName()+"sequence:"+j);
                        j++;
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    countDownLatch.countDown();
                }
            },"thread"+i).start();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void test1(Plate plate) {
        CountDownLatch countDownLatch = new CountDownLatch(11);
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                for (int j = 0; j < 10; j++) {
                    try {
                        plate.add(new Product());
//                        System.out.println(j);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("end");
                countDownLatch.countDown();
            }).start();
        }

        new Thread(()->{
            int j =0;
            try {
                while (j<100){
                    Product product = plate.get();
                    if(product!=null){
                        j++;
                    }
//                    System.out.println(j);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(j);
            countDownLatch.countDown();
        }).start();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
