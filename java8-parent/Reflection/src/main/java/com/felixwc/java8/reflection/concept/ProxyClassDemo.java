package com.felixwc.java8.reflection.concept;

import com.felixwc.java8.reflection.pojo.MyObject;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * in order to learn java!
 * created at 2022/1/7 16:07
 *
 * @author wangchao
 */
public class ProxyClassDemo {

    public static void main(String[] args) {
        Class<MyObject> myObjectClass = MyObject.class;
        Method[] methods = myObjectClass.getMethods();
        Arrays.stream(methods).forEach(System.out::println);
    }
}
