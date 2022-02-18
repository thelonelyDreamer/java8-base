package com.felixwc.java8.data.structure.queue;


import java.time.LocalDate;
import java.util.ArrayDeque;

/**
 * in order to learn java!
 * created at 2022/1/15 21:21
 *
 * @author wangchao
 */
public class ArrayQueueDemo {
    // 本质是双端队列
    private final static ArrayDeque<LocalDate> ARRAY_DEQUE = new ArrayDeque<>();

    static {
        // 队列添加元素
        ARRAY_DEQUE.add(LocalDate.of(123,12,12));
        ARRAY_DEQUE.add(LocalDate.of(133,12,12));
    }

    public static void main(String[] args) {
        ARRAY_DEQUE.forEach(System.out::println);
    }
}
