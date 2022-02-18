package com.felixwc.java8.reflection.pojo;

import com.felixwc.java8.reflection.common.Felix;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * in order to learn java!
 * created at 2022/1/13 20:38
 *
 * @author wangchao
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Felix
public class MyObject implements Comparable<MyObject>,Runnable{
    private long id;
    private String name;

    @Override
    public int compareTo(MyObject o) {
        return 0;
    }

    @Override
    public void run() {
        System.out.println("this is run method in MyObject");
    }


    private void testMethod(){
        System.out.println("this is private testMethod in MyObject,");
    }
}
