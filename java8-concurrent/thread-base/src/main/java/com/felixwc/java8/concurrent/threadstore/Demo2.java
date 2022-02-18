package com.felixwc.java8.concurrent.threadstore;

/**
 * in order to learn java!
 * created at 2022/2/12 14:53
 *
 * @author wangchao
 */
public class Demo2 {
    public static class Tools {
        public static InheritableThreadLocal<String> t1 = new InheritableThreadLocal<>();
    }

    public static class ThreadA extends Thread {
        @Override
        public void run() {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("在ThreadA线程中取值=" + Tools.t1.get());
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                if (Tools.t1.get() == null) {
                    Tools.t1.set("此值是main线程放入的");
                }
                System.out.println("在Main线程中取值=" + Tools.t1.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            ThreadA threadA = new ThreadA();
            threadA.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
