package org.example.function;

import org.junit.Test;

import java.util.function.BiFunction;

/**
 * in order to learn java!
 * created at 2022/9/14 17:38
 *
 * @author felixwc
 */
public class BiFunctionDemo {
    @Test
    public void test(){
        BiFunction<Integer,Long,String> function = (i,l)->i.toString()+l.toString();
        System.out.println(function.apply(1, 2l));
    }

}
