package com.felixwc.optional;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * in order to learn java!
 * created at 2022/4/11 19:20
 *
 * @author wangchao
 */
public class Demo1 {

    private static Optional<String> optional ;

    private static void test() {
        Stream<String> stream = Stream.of("test","test").distinct();
        Optional<String> element = stream.findFirst();
        try {
            element.orElseThrow(()->{return new Exception("");});
            String ss = element.orElseGet(()->{return "test";});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void test1(){
        Stream<String> stream = Stream.of("test");
        Optional<String> element = stream.findFirst();
    }

    public static void main(String[] args) {
        test();
    }
}
