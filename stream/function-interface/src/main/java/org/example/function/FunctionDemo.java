package org.example.function;

import org.junit.Test;

import java.util.function.Function;

/**
 * in order to learn java!
 * created at 2022/9/14 17:37
 *
 * @author felixwc
 */
public class FunctionDemo {
    @Test
    public void test(){
        Function<Integer,String> function = (num)->num.toString();
        System.out.println(function.apply(12));
    }

    @Test
    public void test1(){
        Function<Integer,Integer> function1 = x->x*2;
        Function<Integer,Integer> function2 = x->x*x;
        System.out.println(function1.andThen(function2).apply(5));
    }
}
