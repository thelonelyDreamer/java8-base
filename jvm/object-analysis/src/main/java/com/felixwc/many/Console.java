package com.felixwc.many;

import org.openjdk.jol.info.ClassLayout;

/**
 * in order to learn java!
 * created at 2022/9/28 14:17
 *
 * @author felixwc
 */
public class Console {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(ClassLayout.parseInstance(b).toPrintable());
        System.out.println(b.hashCode());
        System.out.println(ClassLayout.parseInstance(b).toPrintable());
    }
}
