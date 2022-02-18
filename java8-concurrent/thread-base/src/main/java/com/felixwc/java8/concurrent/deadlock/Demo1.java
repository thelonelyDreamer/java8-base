package com.felixwc.java8.concurrent.deadlock;

/**
 * in order to learn java!
 * created at 2022/2/12 02:35
 *
 * @author wangchao
 */

/**
 * 由于内存模型，导致更改的变量具有不可见性，出现死循环
 */
public class Demo1 {
    private static class RunThead extends Thread{
        private boolean isRunning = true;
        //private volatile boolean isRunning = true;
        private boolean isRunning(){
            return  isRunning;
        }
        public void setRunning(boolean isRunning){
            this.isRunning = isRunning;
        }

        @Override
        public void run() {
            System.out.println("come into method run()");
            while (isRunning){

            }
            System.out.println("this thread is stopped");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        RunThead runThead = new RunThead();
        runThead.start();
        Thread.sleep(3000);
        runThead.setRunning(false);
        System.out.println("已经赋值为false");
    }

}
