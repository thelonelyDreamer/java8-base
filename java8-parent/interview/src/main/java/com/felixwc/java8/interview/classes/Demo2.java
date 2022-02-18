package com.felixwc.java8.interview.classes;

/**
 * in order to learn java!
 * created at 2022/2/7 20:11
 *
 * @author wangchao
 */
public class Demo2 {
    private static String staticProperty = "1";
    private String property = "a";
    static {
        staticProperty="2";
    }

    public Demo2() {
        this.property = "b";
        staticProperty="3";
    }
    {
        this.property="c";
        staticProperty="4";
    }

    public static void main(String[] args) {
        System.out.println(Demo2.staticProperty);
        System.out.println(new Demo2().property);
    }
}
