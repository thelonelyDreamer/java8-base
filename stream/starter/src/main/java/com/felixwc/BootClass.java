package com.felixwc;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * in order to learn java!
 * created at 2022/4/11 14:56
 *
 * @author wangchao
 */
public class BootClass {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(0,10);
        OptionalInt first = intStream.findFirst();
        int asInt = first.getAsInt();
        System.out.println(asInt);
    }
}
