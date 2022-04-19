package com.felixwc;

import org.openjdk.jol.info.ClassLayout;

import java.util.LinkedList;

/**
 * in order to learn java!
 * created at 2022/4/3 00:42
 *
 * @author wangchao
 */
public class BasicTypeObject {
    private int a;
    private long b;
    private short c;
    private byte d;
    private double e;
    private float f;
    private char g;
    private boolean h;

    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        String s = ClassLayout.parseInstance(strings).toPrintable();
        System.out.println(s);
    }
}
