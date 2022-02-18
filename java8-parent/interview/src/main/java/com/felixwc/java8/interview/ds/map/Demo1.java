package com.felixwc.java8.interview.ds.map;

import java.util.HashMap;

/**
 * in order to learn java!
 * created at 2021/11/30 14:18
 *
 * @author wangchao
 */
public class Demo1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name","felix");
        map.put("name","shine");
        System.out.println(map.get("name"));
    }
}
