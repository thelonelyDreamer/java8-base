package com.felixwc.java8.concurrent.problem.pojo;

/**
 * in order to learn java!
 * created at 2021/8/20 23:39
 *
 * @author wangchao
 */
public class FinalSingleton {
    private static final FinalSingleton SINGLETON ;
    private FinalSingleton(){}
    static {
        SINGLETON = new FinalSingleton();
    }
    public static FinalSingleton getSingleton() {
        if (null == SINGLETON) {
            System.out.println("error: singleton is null");
        }
        return SINGLETON;
    }

}

