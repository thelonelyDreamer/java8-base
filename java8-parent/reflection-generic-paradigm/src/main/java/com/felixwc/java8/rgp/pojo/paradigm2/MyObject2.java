package com.felixwc.java8.rgp.pojo.paradigm2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * in order to learn java!
 * created at 2022/2/10 01:21
 *
 * @author wangchao
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MyObject2<T,S> {
    private T t;
    private S s;
}
