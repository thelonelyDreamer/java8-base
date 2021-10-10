package com.felixwc.java8.concurrent.atom;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * in order to learn java!
 * created at 2021/8/22 15:51
 *
 * @author wangchao
 */
public class IntegerResource {
    private AtomicInteger integer;

    public IntegerResource(int num) {
        this.integer = new AtomicInteger(num);
    }

    public int getNum(){
        return integer.get();
    }

    public int addNum(int num){
        return this.integer.addAndGet(num);
    }
}
