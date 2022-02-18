package com.felixwc.java8.interview.base;

/**
 * in order to learn java!
 * created at 2021/11/29 23:56
 *
 * @author wangchao
 */
public class Test {
    public static void main(String[] args) {
        int i=1;
        i=i++;
        int j=i++;
        int k=++i + ++i*i++;
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("k="+k);
    }
}
