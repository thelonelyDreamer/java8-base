package com.felixwc.java8.concurrent.resource.number;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * in order to learn java!
 * created at 2021/8/20 16:55
 *
 * @author wangchao
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class ANumberAdd10000 implements Runnable{
    private static volatile AtomicInteger count  = new AtomicInteger(0);
    private int id;
    @Override
    public void run() {
        for(int i =0;i<10000;i++){
            count.addAndGet(1);
        }
        System.out.println(id+"结束"+count);
    }

}
