package com.felixwc.java8.interview.pojo;

/**
 * in order to learn java!
 * created at 2022/3/18 12:41
 *
 * @author wangchao
 */
public class Son extends Father {
   static {
       System.out.println("a");
   }

    public Son() {
        System.out.println("b");
    }

    public static void main(String[] args) {
        Son son = new Son();
        son=new Son();
    }
}
