package com.felixwc.mylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * in order to learn java!
 * created at 2022/4/19 19:46
 *
 * @author felixwc
 */
public class ListDemo {
    private static final List<String> LIST = new ArrayList<>();
    static {
        LIST.add("one");
        LIST.add("two");
        LIST.add("three");
    }
    public static void test1(){
        Iterator<String> iterator = LIST.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        test1();
    }
}
