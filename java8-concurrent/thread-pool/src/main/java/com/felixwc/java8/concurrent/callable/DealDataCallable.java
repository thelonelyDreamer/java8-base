package com.felixwc.java8.concurrent.callable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.Callable;

/**
 * in order to learn java!
 * created at 2021/8/20 18:46
 *
 * @author wangchao
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DealDataCallable<T> implements Callable<T> {
    private T param;
    @Override
    public T call() throws Exception {
        Thread.sleep(3*1000);
        return param;
    }
}
