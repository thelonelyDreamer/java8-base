package com.felixwc.block.queue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * in order to learn java!
 * created at 2022/4/2 21:02
 *
 * @author wangchao
 */
public class BlockQueueDemo {

    public static void main(String[] args) {
        ArrayBlockingQueue<String> strings = new ArrayBlockingQueue<String>(10);
        strings.add("h");
        strings.add("e");

        ArrayList<String> strings1 = new ArrayList<>();
        strings.drainTo(strings1,1);
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (String s : strings1) {
            System.out.println(s);
        }
    }
}
