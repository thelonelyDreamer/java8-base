package com.felixwc;

import org.openjdk.jol.info.ClassLayout;

import java.util.HashMap;

/**
 * in order to learn java!
 * created at 2022/9/27 14:17
 *
 * @author felixwc
 */
public class HashMapObject {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("key"+i,"value"+i);
        }
        System.out.println(ClassLayout.parseInstance(map).toPrintable());
    }
}
