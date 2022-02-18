package com.felixwc.java8.interview.param;

import java.util.Arrays;

/**
 * in order to learn java!
 * created at 2022/1/6 01:16
 *
 * @author wangchao
 */
public class Demo1 {
    public static void main(String[] args) {
        int i = 1;
        String str = "hello";
        Integer num = 2;
        int[] arr = {1, 2, 3, 4, 5};
        MyData myData = new MyData();
        charge(i,str,num,arr,myData);
        System.out.println("i="+i);
        System.out.println("str="+str);
        System.out.println("num="+num);
        System.out.println("arr="+ Arrays.toString(arr));
        System.out.println("my.a="+myData.a);
    }

    public static void charge(int i, String s, Integer n, int[] a, MyData m) {
        i += 1;
        s += "world";
        n += 1;
        a[0] +=1;
        m.a+=1;
    }
}

class MyData {
    int a = 10;
}
