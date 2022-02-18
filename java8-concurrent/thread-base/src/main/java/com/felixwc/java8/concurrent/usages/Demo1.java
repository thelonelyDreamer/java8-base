package com.felixwc.java8.concurrent.usages;

/**
 * in order to learn java!
 * created at 2022/2/12 02:22
 *
 * @author wangchao
 */

/**
 * 多线程可以用于解决死循环
 */
public class Demo1 {
    private static class Printer implements Runnable {
        private boolean isContinuePrint = true;

        private boolean isContinuePrint() {
            return isContinuePrint;
        }

        private void setContinuePrint(boolean isContinuePrint) {
            this.isContinuePrint = isContinuePrint;
        }

        private void printStringMethod(){
            try {
                while (isContinuePrint){
                    System.out.println("run printStringMethod threadName = "+
                            Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        @Override
        public void run() {
            printStringMethod();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer();
        new Thread(printer).start();
        Thread.sleep(3000);
        System.out.println("I want to stop! this thread is "
        +Thread.currentThread().getName());
        printer.setContinuePrint(false);
    }
}
