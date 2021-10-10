package com.felixwc.java8.concurrent.resource.number;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

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
public class NumberAdd10000 implements Runnable{
    private NumberResource resource;
    private int id;
    @Override
    public void run() {
        for(int i =0;i<10000;i++){
            synchronized (resource) {
                resource.setNumber(resource.getNumber() + 1);
            }
        }
        System.out.println(id+"结束");
    }

}
