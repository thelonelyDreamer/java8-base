package com.felixwc.java8.data.structure.array.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Arrays;

/**
 * in order to learn java!
 * created at 2022/2/7 22:57
 *
 * @author wangchao
 */
public class Demo1 {
    private static person[] people=new person[5];

    public static void main(String[] args) {
        person shine = new person("shine", 12);
        Arrays.fill(people,shine);
        shine.setAge(18);
        Arrays.stream(people).forEach(System.out::println);
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    public static class person{
        private String name;
        private int age;
    }
}
