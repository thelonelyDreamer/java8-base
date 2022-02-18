package com.felixwc.java8.data.structure.heap;

import java.time.LocalDate;
import java.util.PriorityQueue;

/**
 * in order to learn java!
 * created at 2022/1/15 21:50
 *
 * @author wangchao
 */

/**
 * 底层是数组
 */
public class PriorityQueueDemo {

    public static void test1(){
        PriorityQueue<LocalDate> localDates = new PriorityQueue<>();
        localDates.add(LocalDate.of(1906,12,9));
        localDates.add(LocalDate.of(1815,12,10));
        localDates.add(LocalDate.of(1903,12,3));
        localDates.add(LocalDate.of(1910,6,22));
        System.out.println("Iterating over elements...");
        for (LocalDate localDate : localDates) {
            System.out.println(localDate);
        }
        System.out.println("Removing elements...");
        while (!localDates.isEmpty()){
            System.out.println(localDates.remove());
        }
    }

    public static void main(String[] args) {
        test1();
    }

}
