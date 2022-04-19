package com.felixwc.java8.data.structure.queue;

import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.Queue;

/**
 * in order to learn java!
 * created at 2022/1/15 01:22
 *
 * @author wangchao
 */
public class QueueDemo {
    private static final Queue<LocalDate> queue = new ArrayDeque<>();

    public static void main(String[] args) {
        // 添加元素
        queue.add(LocalDate.of(1993,12,12));
        queue.offer(LocalDate.of(1993,12,42));
        // 查看队首元素
        queue.element();
        queue.peek();
        // 移除元素
        queue.remove();
        queue.poll();
    }
}
