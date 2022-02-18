package com.felixwc.java8.concurrent.innerclass;

/**
 * in order to learn java!
 * created at 2022/2/11 20:38
 *
 * @author wangchao
 */
public class Demo2 {
    private static class InnerClass{
        public void method1(){
            synchronized ("other lock"){
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+" i="+i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        private synchronized void method2(){
            for (int i = 11; i <=20; i++) {
                System.out.println(Thread.currentThread().getName()+" i="+i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        final InnerClass innerClass = new InnerClass();
        Thread a = new Thread(() -> {
            innerClass.method1();
        }, "A");
        Thread b = new Thread(() -> {
            innerClass.method2();
        }, "B");
        a.start();
        b.start();
    }
}
