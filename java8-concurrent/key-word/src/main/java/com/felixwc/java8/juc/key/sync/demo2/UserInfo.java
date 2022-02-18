package com.felixwc.java8.juc.key.sync.demo2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * in order to learn java!
 * created at 2022/1/25 00:31
 *
 * @author wangchao
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
    private String username;
    private String password;
}
