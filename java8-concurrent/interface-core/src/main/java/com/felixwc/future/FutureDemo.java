package com.felixwc.future;

import java.util.concurrent.*;

/**
 * in order to learn java!
 * created at 2022/10/16 19:22
 *
 * @author felixwc
 */
public class FutureDemo {

    public static void quickStart(){
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<String> future = service.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("开始计算");
                TimeUnit.SECONDS.sleep(1);
                if (Math.random()>0.5) {
                    throw new Exception("异常");
                }
                System.out.println("结束计算");
                return "正常";
            }
        });
        try {
            future.get();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } catch (ExecutionException e) {
            System.out.println(e.getMessage());
        }
        service.shutdown();
    }

    public static void main(String[] args) {
        quickStart();
    }
}
