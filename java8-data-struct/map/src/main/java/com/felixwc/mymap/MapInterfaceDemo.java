package com.felixwc.mymap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * in order to learn java!
 * created at 2022/4/19 19:31
 *
 * @author felixwc
 */
public class MapInterfaceDemo {
    private static final Map<Integer,String> MAP = new HashMap<>();
    static {
        MAP.put(1,"one");
        MAP.put(2,"two");
        MAP.put(3,"three");
        MAP.put(4,"one");
    }

    //遍历key
    public static void visitKey(){
        Set<Integer> integerSet = MAP.keySet();
        for (Integer integer : integerSet) {
            System.out.println(integer);
        }
    }

    //遍历value
    public static void visitValue(){
        Collection<String> values = MAP.values();
        for (String value : values) {
            System.out.println(value);
        }
    }

    // 遍历key-value
    public static void visitKeyValue(){
        Set<Map.Entry<Integer, String>> entries = MAP.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"--->"+value);
        }
    }
    public static void main(String[] args) {
        visitKey();
        visitValue();
        visitKeyValue();
    }
}
