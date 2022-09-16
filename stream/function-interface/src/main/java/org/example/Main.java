package org.example;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer,String> fun1 =(num)->num.toString();
        Function<Integer, String> fun2 = fun1.andThen(s -> "结果为" + s);
        System.out.println(fun2==fun1);
    }
}