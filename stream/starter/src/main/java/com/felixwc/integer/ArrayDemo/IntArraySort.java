package com.felixwc.integer.ArrayDemo;

import java.util.Arrays;

/**
 * in order to learn java!
 * created at 2022/4/11 15:14
 *
 * @author wangchao
 */
public class IntArraySort {
    public static void arraySort(){
        int[] arr = {1,23,4,3,45};
        Arrays.stream(arr).sorted().forEach(System.out::println);
    }

    public static void main(String[] args) {
        arraySort();
    }
}
