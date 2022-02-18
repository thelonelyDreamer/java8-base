package com.felixwc.java8.data.structure.map;

import java.util.IdentityHashMap;

/**
 * in order to learn java!
 * created at 2022/1/16 14:45
 *
 * @author wangchao
 */
public class IdentityHashMapDemo {
    /**
     * 散列值用System.identityHashCode方法计算。这是Object.hashCode根据内存地址计算散列值
     * 在比较两对象时，直接比较两个对象的内存地址
     */

    public static void test1(){
        IdentityHashMap<String, String> map = new IdentityHashMap<>();
        map.put("a","a");
        map.put(new String("a"),"a");
        System.out.println(map.size());//2
    }

    public static void main(String[] args) {
        test1();
    }
}
