package com.felixwc.java8.concurrent.threadstore;

/**
 * in order to learn java!
 * created at 2022/2/12 13:58
 *
 * @author wangchao
 */
public class Demo1 {
    public static class Tools{
        public static ThreadLocal<String> string = new ThreadLocal<>();
    }

    public static class ThreadA extends Thread{
        @Override
        public void run() {
            try{
                for (int i = 0; i < 10; i++) {
                    System.out.println("在 ThreadA 线程中取值="+Tools.string.get());
                    Thread.sleep(1000);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try{
            for (int i = 0; i < 10; i++) {
                if(Tools.string.get()==null){
                    Tools.string.set("此值是main线程放入！");
                    System.out.println(" 在Main线程中取值="+Tools.string.get());
                    Thread.sleep(100);
                }
            }
            Thread.sleep(5000);
            ThreadA threadA = new ThreadA();
            threadA.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
