package com.felixwc.java8.concurrent.forkjoin;

import java.util.concurrent.RecursiveTask;

/**
 * in order to learn java!
 * created at 2021/8/21 00:05
 *
 * @author wangchao
 */
public class MyForkJoinTask extends RecursiveTask<Integer> {
    private static final int MAX = 20;
    private int start;
    private int end;

    public MyForkJoinTask(int start, int end) {
        this.start = start;
        this.end = end;
    }
    @Override
    protected Integer compute() {
        if((end-start) < MAX) {
            int count=0;
            for(int i= start; i<end;i++) {
                count+=i;
            }
            return count;
        }else {
            // 将大任务分解成两个小任务
            int middle = (start + end) / 2;
            MyForkJoinTask left = new MyForkJoinTask(start, middle);
            MyForkJoinTask right = new MyForkJoinTask(middle, end);
            return left.join()+right.join();
        }
    }
}
