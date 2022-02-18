package com.felixwc.java8.data.structure.top;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * in order to learn java!
 * created at 2022/1/16 01:45
 *
 * @author wangchao
 */
public class IteratorDemo {
    private static Collection<String> collection;
    private static Iterator<String> iterator = collection.iterator();

    private static void demo(){
        // 是否存在一个可访问的对象
        iterator.hasNext();
        // 返回访问的对象
        iterator.next();
        // 移除刚刚访问的对象
        iterator.remove();
        // 遍历每个元素，直至最后，或者抛出异常
        iterator.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {

            }
        });

    }

    public static void main(String[] args) {

    }
}
