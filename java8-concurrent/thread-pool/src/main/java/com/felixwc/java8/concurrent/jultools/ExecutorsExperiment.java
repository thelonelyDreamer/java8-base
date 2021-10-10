package com.felixwc.java8.concurrent.jultools;

import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executors;

/**
 * in order to learn java!
 * created at 2021/8/20 20:14
 *
 * @author wangchao
 */
public class ExecutorsExperiment{

    public static Set<String> getThreadPoolFactory(){
        Method[] methods = Executors.class.getMethods();
        Set<String> set = new LinkedHashSet<>();
        for (Method method : methods) {
           set.add(method.getName().substring(3));
        }
        return set;
    }
}
