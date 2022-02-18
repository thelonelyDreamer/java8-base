package com.felixwc.java8.juc.key.sync;

/**
 * in order to learn java!
 * created at 2022/2/16 22:40
 *
 * @author wangchao
 */

/**
 * 重写方法如果不使用synchronized 关键字，则是非同步方法
 */
public class Demo4 {
    private static class Base {
        synchronized protected void serviceMethod() {
            try {
                System.out.println("Base serviceMethod begin ThreadName =" + Thread.currentThread().getName()
                        + "BeginTime =" + System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("Base serviceMethod end ThreadName =" + Thread.currentThread().getName()
                        + "EndTime =" + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static class Child extends Base{
        @Override
        // protected synchronized void serviceMethod(){
        protected  void serviceMethod() {
            try {
                System.out.println("Child serviceMethod begin ThreadName =" + Thread.currentThread().getName()
                        + "BeginTime =" + System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("Child serviceMethod end ThreadName =" + Thread.currentThread().getName()
                        + "EndTime =" + System.currentTimeMillis());
                super.serviceMethod();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static class ThreadA extends Thread{
        private Child child;

        public ThreadA(Child child) {
            this.child = child;
        }

        @Override
        public void run() {
            child.serviceMethod();
        }
    }

    private static class ThreadB extends Thread{
        private Child child;

        public ThreadB(Child child) {
            this.child = child;
        }
        @Override
        public void run() {
            child.serviceMethod();
        }
    }

    public static void main(String[] args) {
        Child child = new Child();

        ThreadA threadA = new ThreadA(child);
        threadA.setName("A");
        threadA.start();

        ThreadB threadB = new ThreadB(child);
        threadB.setName("B");
        threadB.start();
    }
}
