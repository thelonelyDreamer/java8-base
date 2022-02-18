package com.felixwc.java8.reflection.common;

/**
 * in order to learn java!
 * created at 2022/1/4 01:43
 *
 * @author wangchao
 */
@Felix
public class MyClass implements Action1,Action2{
    @Override
    public String returnString() {
        return "test";
    }

    @Override
    public int returnInt() {
        return 0;
    }
}
