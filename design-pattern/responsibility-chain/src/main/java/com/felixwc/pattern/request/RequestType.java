package com.felixwc.pattern.request;

/**
 * in order to learn java!
 * created at 2022/6/3 14:18
 *
 * @author felixwc
 */
public enum RequestType {
    TYPE1("type1",1),
    TYPE2("type2",2),
    TYPE3("type3",3);

    private String name;
    private Integer weight;
    RequestType(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }
}
