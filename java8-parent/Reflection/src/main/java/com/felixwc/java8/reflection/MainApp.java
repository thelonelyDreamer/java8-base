package com.felixwc.java8.reflection;

import com.felixwc.java8.reflection.common.MyClass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * in order to learn java!
 * created at 2022/1/4 01:34
 *
 * @author wangchao
 */
public class MainApp {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        Class<MyClass> myClassClass = MyClass.class;
        MyClass myClass = myClassClass.newInstance();
        Method returnString = myClassClass.getMethod("returnString");
        Object invoke = returnString.invoke(myClass);
        Class<?> returnType = returnString.getReturnType();
        System.out.println(invoke);

    }
}
