package com.felixwc.str;

import org.junit.Test;

import java.util.StringJoiner;

/**
 * in order to learn java!
 * created at 2022/9/14 12:40
 *
 * @author felixwc
 */
public class StringJoinerDemo {
    @Test
    public void test(){
        StringJoiner stringJoiner = new StringJoiner(",", "pre", "suf");
        stringJoiner.add("-a-");
        stringJoiner.add("-b-");
        stringJoiner.add("-c-");
        System.out.println(stringJoiner);
    }
}
