package com.felixwc.java8.reflection;

import com.felixwc.java8.reflection.pojo.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * in order to learn java!
 * created at 2022/1/4 01:34
 *
 * @author wangchao
 */
public class MainApp {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        Constructor<?>[] constructors = Person.class.getConstructors();
        System.out.println(constructors.length);
        Person person = Person.class.newInstance();
        System.out.println(person);
    }
}
