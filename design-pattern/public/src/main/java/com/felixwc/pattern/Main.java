package com.felixwc.pattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        Object o = Proxy.newProxyInstance(testClass.getClass().getClassLoader(),
                testClass.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println(method.getName());
                        Object invoke = method.invoke(testClass, args);
                        return invoke;
                    }
                });
        TestInterface anInterface =(TestInterface)o;
        System.out.println(anInterface.sayHello());
    }
}