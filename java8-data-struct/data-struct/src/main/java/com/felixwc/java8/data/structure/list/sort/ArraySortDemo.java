package com.felixwc.java8.data.structure.list.sort;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * in order to learn java!
 * created at 2022/1/14 00:47
 *
 * @author wangchao
 */
public class ArraySortDemo {
    private static List<ASPerson> list;

    static {
        list = new ArrayList<ASPerson>();
        list.add(new ASPerson().setAge(18).setFirstName("shine1").setLastName("Black1"));
        list.add(new ASPerson().setAge(19).setFirstName("shine2").setLastName("Black2"));
        list.add(new ASPerson().setAge(17).setFirstName("shine3").setLastName("Black3"));
        list.add(new ASPerson().setAge(22).setFirstName("shine4").setLastName("Black4"));
        list.add(new ASPerson().setAge(28).setFirstName("shine5").setLastName("Black5"));
    }

    private static void sort1(){
        list.sort(Comparator.comparing(ASPerson::getAge)
                .thenComparing(ASPerson::getFirstName)
                .thenComparing(ASPerson::getLastName));
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        sort1();
    }

    @Data
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
    @Accessors(chain = true)
    static class ASPerson{
        private String firstName; // 定义名字
        private String lastName;  // 定义姓氏
        private int age;
    }
}
