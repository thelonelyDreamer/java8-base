package com.felixwc.java8.data.structure.array;

import java.util.Arrays;

/**
 * in order to learn java!
 * created at 2022/7/18 23:07
 *
 * @author felixwc
 */
public class D2ArrayDemo {

    public static void main(String[] args) {
        Person[][] seat = new Person[3][2];
        seat[0][0] = new Person();
        System.out.println(Arrays.deepToString(seat));
    }

    private static class Person{
        private String name;
        private Integer age;

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
