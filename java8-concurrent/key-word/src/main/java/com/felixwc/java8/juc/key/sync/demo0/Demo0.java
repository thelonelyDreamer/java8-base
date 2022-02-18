package com.felixwc.java8.juc.key.sync.demo0;

/**
 * in order to learn java!
 * created at 2022/1/25 00:14
 *
 * @author wangchao
 */
public class Demo0 {
    // 锁 类对象
    synchronized public static void testMethod1(){}
    public void testMethod2(){
        synchronized (Demo0.class){

        }
    }
    // 锁 实例对象
    synchronized public void testMethod3(){}
    public void testMethod4(){
        synchronized (this){

        }
    }

    // 锁 其他对象
    synchronized void testMethod5(){
        synchronized (new Object()){

        }
    }
}
