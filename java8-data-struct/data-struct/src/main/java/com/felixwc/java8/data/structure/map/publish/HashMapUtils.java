package com.felixwc.java8.data.structure.map.publish;

import java.util.HashMap;

/**
 * in order to learn java!
 * created at 2021/11/21 00:42
 *
 * @author wangchao
 */
public class HashMapUtils {
    public static HashMap<String,Person> getMap(){
        HashMap<String, Person> map = new HashMap<>();
        map.put("1",new Person(1,"zhangsan"));
        return map;
    }
}
