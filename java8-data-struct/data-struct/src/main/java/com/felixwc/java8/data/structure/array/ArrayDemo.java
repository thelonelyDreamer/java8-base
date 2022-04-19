package com.felixwc.java8.data.structure.array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * in order to learn java!
 * created at 2022/1/14 01:30
 *
 * @author wangchao
 */
public class ArrayDemo {

    public static void main(String[] args) {
        String[] strings = new String[10];
        for (int i = 0; i <10 ; i++) {
            strings[i] = String.valueOf(i*i*i);
        }
        Arrays.sort(strings, Comparator.comparingInt(String::length).reversed());
        Arrays.stream(strings).forEach(System.out::println);
    }
}
