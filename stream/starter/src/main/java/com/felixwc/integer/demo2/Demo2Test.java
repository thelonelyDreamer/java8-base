package com.felixwc.integer.demo2;

import java.util.Random;

/**
 * in order to learn java!
 * created at 2022/4/11 15:21
 *
 * @author wangchao
 */
public class Demo2Test {
    public static void test(){
        double average = new Random().ints().limit(1000).summaryStatistics().getAverage();
        System.out.println(average);
    }

    public static void main(String[] args) {
        test();
    }
}
