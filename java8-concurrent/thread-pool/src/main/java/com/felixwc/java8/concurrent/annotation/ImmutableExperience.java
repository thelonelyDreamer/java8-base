package com.felixwc.java8.concurrent.annotation;

import jdk.nashorn.internal.ir.annotations.Immutable;

/**
 * in order to learn java!
 * created at 2021/8/20 12:45
 *
 * @author wangchao
 */
@Immutable
public class ImmutableExperience {
    private int num;
    private String str;

    public ImmutableExperience(int num, String str) {
        this.num = num;
        this.str = str;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "ImmutableExperience{" +
                "num=" + num +
                ", str='" + str + '\'' +
                '}';
    }
}
