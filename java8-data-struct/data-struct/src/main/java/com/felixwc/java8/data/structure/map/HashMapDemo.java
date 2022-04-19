package com.felixwc.java8.data.structure.map;

import java.util.Collection;
import java.util.HashMap;

/**
 * in order to learn java!
 * created at 2021/9/26 17:07
 *
 * @author wangchao
 */
public class HashMapDemo {
    public static void demo1(){
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "张三");
        String s = map.put("name", "李四");
        System.out.println(s);
        Collection<String> values = map.values();
        values.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        demo1();
    }
}
