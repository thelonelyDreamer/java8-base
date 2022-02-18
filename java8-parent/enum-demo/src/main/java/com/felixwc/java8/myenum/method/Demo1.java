package com.felixwc.java8.myenum.method;

/**
 * in order to learn java!
 * created at 2022/2/8 02:20
 *
 * @author wangchao
 */

/**
 * 展示枚举类中重写的方法
 */
public class Demo1 {
    public static void main(String[] args) {

        for (Result value : Result.values()) {
            System.out.println(value);
        }
    }

    /**
     * 枚举类只有一个方法可以被重写
     */
    private enum Result{
        WIN,LOSE;
        @Override
        public String toString() {
            //name() 获得枚举类的枚举名
            return name().toLowerCase();
        }
    }
}
