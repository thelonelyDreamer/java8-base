package com.felixwc.integer.ArrayDemo;

import java.util.Arrays;

/**
 * in order to learn java!
 * created at 2022/4/11 15:30
 *
 * @author wangchao
 */
public class DistinctDemo {

    public static int[] test(int[] args){
        int[] result = Arrays.stream(args).distinct().toArray();
        return result;
    }

    public static void main(String[] args) {
        int[] test1 = {12,3,6,6,7};
        int[] test11 = test(test1);
        for (int i : test11) {
            System.out.println(i);
        }

        int[] test2 ={};
        int[] test22 = test(test2);
        for(int i : test22){
            System.out.println(i);
        }
    }
}
