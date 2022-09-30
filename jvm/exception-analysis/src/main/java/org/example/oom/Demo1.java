package org.example.oom;

import java.util.LinkedList;

/**
 * in order to learn java!
 * created at 2022/9/27 14:24
 *
 * @author felixwc
 */
public class Demo1 {
    public static void main(String[] args) {
        LinkedList<String> strs = new LinkedList<>();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            strs.add(String.valueOf(i).intern());
        }
    }
}
