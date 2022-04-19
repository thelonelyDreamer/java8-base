package com.felixwc.java8.data.structure.top;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/**
 * in order to learn java!
 * created at 2022/1/15 22:51
 *
 * @author wangchao
 */
public class CollectionDemo {
    private static Collection<String> collection = new ArrayList<>();

    public static void demo(){
        // 获取迭代器
        Iterator<String> iterator = collection.iterator();
        // 获取元素的个数
        int size = collection.size();
        // 集合判空
        boolean empty = collection.isEmpty();
        // 判断是否包含某个对象
        boolean contains = collection.contains("");
        // 判断是否包含某个集合
        collection.containsAll(Arrays.asList("",""));
        // 添加某个元素
        boolean add = collection.add("");
        // 添加某个集合中的元素
        collection.addAll(Arrays.asList(""));
        // 从集合中移除某个对象
        collection.remove("");
        // 从集合中移除另外一个集合中的所有对象
        collection.removeAll(Arrays.asList(""));
        // 从集合中删除符合条件的，如果改变集合，就返回true
        collection.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return false;
            }
        });
        // 清除所有元素
        collection.clear();
        // 留下A交B
        collection.retainAll(Arrays.asList(""));
        //
        Object[] objects = collection.toArray();
        // 若长度够，则填入，多出的部分为null；否则会重新分配一个数组
        String[] strings = new String[5];
        String[] strings1 = collection.toArray(strings);
    }

    public static void main(String[] args) {
        // 添加元素
        collection.add("first string");
        collection.add("second string");
        collection.add("third string");

        // 获取迭代器
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
