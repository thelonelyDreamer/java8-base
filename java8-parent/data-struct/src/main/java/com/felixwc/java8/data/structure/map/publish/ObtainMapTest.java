package com.felixwc.java8.data.structure.map.publish;

import java.util.HashMap;

/**
 * in order to learn java!
 * created at 2021/11/21 00:44
 *
 * @author wangchao
 */
public class ObtainMapTest {

    public static void main(String[] args) {
        HashMap<String, Person> map = HashMapUtils.getMap();
        Person person = map.get("1");
        System.out.println(person);
        person.setName("lisi");
        Person person1 = map.get("1");
        System.out.println(person1);
    }
}
