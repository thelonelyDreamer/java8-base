package com.felixwc.atomic.basetype;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * in order to learn java!
 * created at 2022/2/26 06:42
 *
 * @author wangchao
 */
public class AtomicBooleanDemo {

    @AllArgsConstructor
    @Data
    private static class Service{
        private AtomicBoolean exist;

        private void change(){
            boolean b = exist.get();
            exist.compareAndSet(b,!b);
        }
    }

    @AllArgsConstructor
    private static class ThreadA extends Thread{
        private Service service;
        @Override
        public void run() {
            service.change();
        }
    }

    @AllArgsConstructor
    private static class ThreadB extends Thread{
        private Service service;

        @Override
        public void run() {
            // 只有chang 方法执行的时候是原子操作
            System.out.println(service.exist.get());
            service.change();
            System.out.println(service.exist.get());
        }
    }

    public static void main(String[] args) {
        Service service = new Service(new AtomicBoolean(true));
        ThreadA threadA = new ThreadA(service);
        ThreadB threadB = new ThreadB(service);
        threadA.setName("a");
        threadB.setName("b");
        threadA.start();
        threadB.start();
    }
}
