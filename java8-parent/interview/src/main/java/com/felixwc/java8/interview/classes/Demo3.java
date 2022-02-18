package com.felixwc.java8.interview.classes;

/**
 * in order to learn java!
 * created at 2022/2/7 20:18
 *
 * @author wangchao
 */
public class Demo3 {
    private String name;

    public Demo3() {
        System.out.println("无参构造函数");
    }

    {
        System.out.println("这是匿名代码块");
    }

    public static void main(String[] args) {
        new Demo3();
    }
}
