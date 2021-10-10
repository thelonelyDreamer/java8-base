package com.felixwc.java8.concurrent.resource.number;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * in order to learn java!
 * created at 2021/8/20 16:51
 *
 * @author wangchao
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class NumberResource {
    private int number;
}
