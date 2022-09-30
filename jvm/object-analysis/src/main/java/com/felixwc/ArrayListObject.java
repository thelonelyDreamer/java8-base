package com.felixwc;

import org.openjdk.jol.info.ClassLayout;

import java.util.ArrayList;

/**
 * in order to learn java!
 * created at 2022/9/27 22:23
 *
 * @author felixwc
 */
public class ArrayListObject {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("test");
        System.out.println(ClassLayout.parseInstance(strings).toPrintable());
    }
}
