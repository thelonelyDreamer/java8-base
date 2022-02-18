package com.felixwc.java8.rgp.pojo.paradigm1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * in order to learn java!
 * created at 2022/2/10 01:16
 *
 * @author wangchao
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MyObject1<T> {
    private T t;
    private String name;
    private String description;
}
