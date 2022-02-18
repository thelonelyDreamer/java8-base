package com.felixwc.java8.myenum.method;

/**
 * in order to learn java!
 * created at 2022/2/8 02:45
 *
 * @author wangchao
 */

/**
 * 展示枚举类中固有的方法
 */
public class Demo3 {
    public static void main(String[] args) {
        Status temp = Status.valueOf("A");
        //获取序列号和名字
        temp.ordinal();
        temp.name();
        temp.toString();
    }

    private static void classMethods(){
        Status.values();//获得所有枚举类型
        Status.valueOf("A");//
        Status.valueOf(Status.class,"A");
    }

    private enum Status{
        A,B,C,D;
    }
}
