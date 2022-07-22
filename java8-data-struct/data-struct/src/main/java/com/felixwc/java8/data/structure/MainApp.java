package com.felixwc.java8.data.structure;

import java.util.Collection;
import java.util.TreeSet;

/**
 * in order to learn java!
 * created at 2021/9/26 16:02
 *
 * @author wangchao
 */
public class MainApp {
    public static void main(String[] args) {
        Collection<String> collection = new TreeSet<>();
        collection.add("s");
        collection.add("t");
        collection.add("s");
        collection.add("d");
        collection.iterator().forEachRemaining(System.out::println);
    }
}
