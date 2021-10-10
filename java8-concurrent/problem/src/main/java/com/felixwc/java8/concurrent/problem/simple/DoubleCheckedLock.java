package com.felixwc.java8.concurrent.problem.simple;

import javax.annotation.concurrent.NotThreadSafe;
import java.util.HashMap;
import java.util.Map;

/**
 * in order to learn java!
 * created at 2021/8/20 13:23
 *
 * @author wangchao
 */
@NotThreadSafe
public class DoubleCheckedLock {
    // 会发生指令重拍
    private static Map<Integer, String> map;

    public static Map<Integer, String> getMap() {
        if (null == map) {
            synchronized (DoubleCheckedLock.class) {
                if(null == map) map = new HashMap<>();
            }
        }
        return map;
    }
}

