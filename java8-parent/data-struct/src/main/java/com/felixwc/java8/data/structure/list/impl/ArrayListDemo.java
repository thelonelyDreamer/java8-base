package com.felixwc.java8.data.structure.list.impl;

import java.util.ArrayList;

/**
 * in order to learn java!
 * created at 2022/1/15 22:35
 *
 * @author wangchao
 */
public class ArrayListDemo {
    private static final ArrayList<String> ARRAY_LIST = new ArrayList<>();

    private static void ArrayListLengthDemo(){
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            System.out.println(strings.size());
            strings.add("shine");
        }
    }
    public static void main(String[] args) {
        ArrayListLengthDemo();
    }
}
