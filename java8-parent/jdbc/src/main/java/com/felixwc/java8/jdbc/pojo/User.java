package com.felixwc.java8.jdbc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * in order to learn java!
 * created at 2021/9/19 13:16
 *
 * @author wangchao
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class User {
    private long id;
    private String name;
    private int age;
    private String email;
}
