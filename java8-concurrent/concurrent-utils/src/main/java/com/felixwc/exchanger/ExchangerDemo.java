package com.felixwc.exchanger;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * in order to learn java!
 * created at 2022/7/3 11:27
 *
 * @author felixwc
 */
public class ExchangerDemo {
    private static final Exchanger<String> STRING_EXCHANGER = new Exchanger<>();
    private static final ExecutorService EXECUTOR_SERVICE = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        EXECUTOR_SERVICE.execute(() -> {
            try {
                String a = "银行流水-A";
                String exchange = STRING_EXCHANGER.exchange(a);
                System.out.println(a+"==="+exchange);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        EXECUTOR_SERVICE.execute(() -> {
            try {
                String b = "银行流水-B";
                String exchange = STRING_EXCHANGER.exchange(b);
                System.out.println(b+"==="+exchange);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        EXECUTOR_SERVICE.shutdown();
    }

}
