package com.felixwc.java8.concurrent.problem.test;

/**
 * in order to learn java!
 * created at 2021/8/20 21:48
 *
 * @author wangchao
 */
public class Resource {
    private volatile int[] arr = {0,1,2};

    public int getArr(int index) {
        return arr[index];
    }

    public Resource setArr(int index,int value) {
        synchronized (this){
            this.arr[index] = value;
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return this;
    }
}
