package com.felixwc;


import org.openjdk.jol.info.ClassLayout;

/**
 * in order to learn java!
 * created at 2022/4/2 01:50
 *
 * @author wangchao
 */
public class JavaApp {
    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
    }
}
