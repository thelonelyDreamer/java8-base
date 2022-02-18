package com.felixwc.java8.rgp;

import com.felixwc.java8.rgp.pojo.paradigm1.MyObject1;

import java.util.Arrays;

/**
 * in order to learn java!
 * created at 2022/2/10 01:14
 *
 * @author wangchao
 */
public class RGPBootDemo {
    public static void main(String[] args) {
        Arrays.stream(MyObject1.class.getTypeParameters()).forEach(System.out::println);
    }
}
