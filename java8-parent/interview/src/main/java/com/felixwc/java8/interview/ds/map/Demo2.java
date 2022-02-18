package com.felixwc.java8.interview.ds.map;

import java.util.HashMap;

/**
 * in order to learn java!
 * created at 2021/11/30 14:21
 *
 * @author wangchao
 */
public class Demo2 {

    public static void main(String[] args) {
        HashMap<String, Person> map = new HashMap<>();
        Person zhangsan = new Person().setName("zhangsan");
        Person shine = new Person().setName("shine");
        map.put("zhangsan",zhangsan);
        map.put("zhangsan",shine);
        System.out.println(zhangsan.equals(shine));
        System.out.println(map.get("zhangsan").getName());
    }

     static class Person{
        private String name;

        public String getName() {
            return name;
        }

        public Person setName(String name) {
            this.name = name;
            return this;
        }

        @Override
        public int hashCode() {
            return 1;
        }

         @Override
         public boolean equals(Object obj) {
             return true;
         }
     }
}
