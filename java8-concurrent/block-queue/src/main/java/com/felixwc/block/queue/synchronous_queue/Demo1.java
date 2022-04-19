package com.felixwc.block.queue.synchronous_queue;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.concurrent.SynchronousQueue;

/**
 * in order to learn java!
 * created at 2022/4/3 01:42
 *
 * @author wangchao
 */
public class Demo1 {
    public static void main(String[] args) {
        SynchronousQueue<Resource> resources = new SynchronousQueue<>();
        Resource resource = new Resource();
        new Thread1<Resource>(resources,resource).start();
        new Thread2<Resource>(resources,resource).start();
    }

    @AllArgsConstructor
    private static class Thread1<T> extends Thread{
        private SynchronousQueue<T> resourcesQueue;
        private T resource;
        @Override
        public void run() {
            System.out.println("Thread1 run 方法开始");
            try {
                resourcesQueue.put(resource);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread1 run 方法结束");
        }
    }

    @AllArgsConstructor
    private static class Thread2<T> extends Thread{
        private SynchronousQueue<T> resourcesQueue;
        private T resource;
        @Override
        public void run() {
            System.out.println("Thread2 run 方法开始");
            try {
                Thread.sleep(3000);
                resourcesQueue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread2 run 方法结束");
        }
    }

    @Data
    private static class  Resource{
        private String name;
    }
}
