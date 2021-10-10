package com.felixwc.java8.time;

import java.time.Duration;
import java.time.Instant;

/**
 * in order to learn java!
 * created at 2021/9/18 11:51
 *
 * @author wangchao
 */
public class InstantExperiment {

    public static void main(String[] args) throws InterruptedException {
        Instant start = Instant.now();
        System.out.println(start);
        Thread.sleep(3000);
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        System.out.println(duration.getSeconds());
    }
}
