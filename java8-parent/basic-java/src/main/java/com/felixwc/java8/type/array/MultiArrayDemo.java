package com.felixwc.java8.type.array;

import java.util.Arrays;

/**
 * in order to learn java!
 * created at 2022/1/22 18:21
 *
 * @author wangchao
 */
public class MultiArrayDemo {

    private static final int[] array1 = new int[10];
    private static final int[][] array2 = new int[2][10];
    private static final int[][][] array3 = new int[10][10][10];

    public static void main(String[] args) {
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.deepToString(array2));
        System.out.println(Arrays.deepToString(array3));
    }
}
