package com.felixwc.java8.juc.key.sync.demo1;

/**
 * in order to learn java!
 * created at 2022/1/24 23:55
 *
 * @author wangchao
 */
public class Service {
    public void printA(){
        synchronized (Service.class){
            try {
                System.out.println("线程名字为： "+ Thread.currentThread().getName()+"在"+System.currentTimeMillis()+
                        "进入printA");
                Thread.sleep(3000);
                System.out.println("线程名字为： "+ Thread.currentThread().getName()+"在"+System.currentTimeMillis()+
                        "离开printA");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printB(){
        synchronized (Service.class){
            try {
                System.out.println("线程名字为： "+ Thread.currentThread().getName()+"在"+System.currentTimeMillis()+
                        "进入printB");
                Thread.sleep(3000);
                System.out.println("线程名字为： "+ Thread.currentThread().getName()+"在"+System.currentTimeMillis()+
                        "离开printB");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
