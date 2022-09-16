package org.example.function;

import org.junit.Test;

import java.util.function.UnaryOperator;

/**
 * in order to learn java!
 * created at 2022/9/14 17:44
 *
 * @author felixwc
 */
public class UnaryOperatorDemo {
    @Test
    public void test(){
        UnaryOperator<Integer> function = e->e*2;
        System.out.println(UnaryOperator.identity().apply(10));
    }
}
