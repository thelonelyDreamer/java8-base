package com.felixwc.java8.data.structure.tools;

import java.util.LinkedList;
import java.util.List;

/**
 * in order to learn java!
 * created at 2022/1/8 00:23
 *
 * @author wangchao
 */
public class CollectionsListDemo {
    private static List<MyObject> list = new LinkedList<>();

    static {
        list.add(new MyObject().setAnInt(1).setStringField("zhangsan"));
        list.add(new MyObject().setAnInt(2).setStringField("lisi"));
        list.add(new MyObject().setAnInt(3).setStringField("wangwu"));
    }


    public static void main(String[] args) {
        //1. 逆序
//        Collections.reverse(list);
//        System.out.println(list);
        //2. 
    }
}

class MyObject implements Comparable<MyObject>{
    private String stringField;
    private int anInt;

    public String getStringField() {
        return stringField;
    }

    public MyObject setStringField(String stringField) {
        this.stringField = stringField;
        return this;
    }

    public int getAnInt() {
        return anInt;
    }

    public MyObject setAnInt(int anInt) {
        this.anInt = anInt;
        return this;
    }

    @Override
    public int compareTo(MyObject o) {
        return this.anInt - o.anInt;
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "stringField='" + stringField + '\'' +
                ", anInt=" + anInt +
                '}';
    }
}