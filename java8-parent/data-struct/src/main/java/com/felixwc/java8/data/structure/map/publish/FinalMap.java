package com.felixwc.java8.data.structure.map.publish;

import java.util.HashMap;
import java.util.Map;

/**
 * in order to learn java!
 * created at 2021/11/21 00:52
 *
 * @author wangchao
 */
public class FinalMap {
    private static final Map<String,String> map = new HashMap();

    public static void main(String[] args) {
        map.put("s","s");
        map.get("s");
    }
}
