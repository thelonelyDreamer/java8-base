package com.felixwc.java8.exception.interview;

/**
 * in order to learn java!
 * created at 2022/2/4 04:05
 *
 * @author wangchao
 */
public class Demo1 {

    private static int getA(){
        int a=1;
        try {
            int b=1/0;
            return a;
        }catch (Exception e){
            System.out.println("deal with the exception");
            a=2;
            return a;
        }finally {
            System.out.println("final");
            a=3;
        }
    }

    public static void main(String[] args) {
        System.out.println(getA());
    }
}
