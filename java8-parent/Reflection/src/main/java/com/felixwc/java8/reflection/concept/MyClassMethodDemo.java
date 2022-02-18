package com.felixwc.java8.reflection.concept;

import com.felixwc.java8.reflection.pojo.MyObject;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * in order to learn java!
 * created at 2022/1/13 21:40
 *
 * @author wangchao
 */
public class MyClassMethodDemo {
    private static Class myObject = MyObject.class;

    private static void testMethod1(){
        // 获取所有的 公共方法，包括从父类继承的方法
        Method[] methods = myObject.getMethods();
        Arrays.stream(methods).forEach(System.out::println);
    }
    private static void testMethod2(){
        //返回这个类和接口的全部方法，但是不包括父类的方法
        Method[] declaredMethods = myObject.getDeclaredMethods();
        Arrays.stream(declaredMethods).forEach(System.out::println);
    }

    public static void main(String[] args) {
        testMethod2();
    }
}
