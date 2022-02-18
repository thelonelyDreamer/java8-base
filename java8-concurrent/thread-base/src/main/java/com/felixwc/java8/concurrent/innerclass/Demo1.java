package com.felixwc.java8.concurrent.innerclass;

/**
 * in order to learn java!
 * created at 2022/2/11 18:56
 *
 * @author wangchao
 */
public class Demo1 {
    private static class InnerClass1{
        public void method1(InnerClass2 class2) throws InterruptedException {
            String threadName = Thread.currentThread().getName();
            synchronized (class2){
                System.out.println(threadName + " 进入 InnerClass1 类中的 method1 方法");
                for (int i = 0; i < 10 ; i++) {
                    System.out.println("i1="+i);
                    Thread.sleep(100);
                }
                System.out.println(threadName + " 离开 InnerClass1 类中的 method1 方法");
            }
        }

        public synchronized void method2() throws InterruptedException {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " 进入 InnerClass1 类中的 method2 方法");
            for (int i = 0; i < 10 ; i++) {
                System.out.println("i2="+i);
                Thread.sleep(100);
            }
            System.out.println(threadName + " 离开 InnerClass1 类中的 method2 方法");
        }
    }
    private static class InnerClass2{
        public synchronized void method1() throws InterruptedException {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " 进入 InnerClass2 类中的 method1 方法");
            for (int i = 0; i < 10 ; i++) {
                System.out.println("i3="+i);
                Thread.sleep(100);
            }
            System.out.println(threadName + " 离开 InnerClass1 类中的 method1 方法");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        InnerClass1 innerClass1 = new InnerClass1();
        InnerClass2 innerClass2 = new InnerClass2();
        Thread t1 = new Thread(() -> {
            try {
                innerClass1.method1(innerClass2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "T1");
        Thread t2 = new Thread(() -> {
            try {
                innerClass1.method2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "T2");
        Thread t3 = new Thread(() -> {
            try {
                innerClass2.method1();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "T3");
        t1.start();
        t2.start();
        t3.start();
    }
}
