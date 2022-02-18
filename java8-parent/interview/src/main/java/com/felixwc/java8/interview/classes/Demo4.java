package com.felixwc.java8.interview.classes;

/**
 * in order to learn java!
 * created at 2022/2/7 21:09
 *
 * @author wangchao
 */
public class Demo4 {
    public static int test(){
        int a=1;
        try {
            int b=1/0;
            a=2;
            return a;
        }catch (Exception e){
            System.out.println("发生异常");
            a=3;
            return a;
        }finally {
            System.out.println("final");
            ++a;
        }
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}
