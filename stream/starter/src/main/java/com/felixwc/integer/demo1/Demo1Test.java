package com.felixwc.integer.demo1;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/**
 * in order to learn java!
 * created at 2022/4/11 15:03
 *
 * @author wangchao
 */
public class Demo1Test {
    public static void main(String[] args) {
        IntStream stream = IntStream.range(12, 100);
        IntStream intStream = stream.filter(new IntPredicate() {
            @Override
            public boolean test(int value) {
                if (value > 50) return true;
                else return false;
            }
        });
        intStream.forEach(System.out::println);
    }
}
