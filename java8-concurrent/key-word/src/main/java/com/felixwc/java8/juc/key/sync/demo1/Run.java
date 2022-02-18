package com.felixwc.java8.juc.key.sync.demo1;

/**
 * in order to learn java!
 * created at 2022/1/25 00:06
 *
 * @author wangchao
 */
public class Run {
    public static void main(String[] args) {
        Service service1 = new Service();
        Service service2 = new Service();
        ThreadA threadA = new ThreadA(service1);
        threadA.setName("A");
        threadA.start();

        ThreadB threadB = new ThreadB(service2);
        threadB.setName("B");
        threadB.start();
    }
}
