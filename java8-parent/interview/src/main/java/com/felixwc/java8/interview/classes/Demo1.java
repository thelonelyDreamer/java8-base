package com.felixwc.java8.interview.classes;

/**
 * in order to learn java!
 * created at 2022/2/7 03:04
 *
 * @author wangchao
 */
public class Demo1 {
    private static int x =100;

    public static void main(String[] args) {
        Demo1 object1 = new Demo1();
        object1.x++;
        Demo1 object2 = new Demo1();
        object2.x +=object1.x;
        object1 = new Demo1();
        object1.x--;
        Demo1.x--;
        System.out.println("x="+object1.x);//x=200
    }
}
