package com.felixwc.java8.juc.key.sync.demo2;

/**
 * in order to learn java!
 * created at 2022/1/25 00:39
 *
 * @author wangchao
 */
public class Run {
    public static void main(String[] args) {
        try{
            Service service = new Service();
            UserInfo userInfo = new UserInfo();
            ThreadA threadA = new ThreadA(service, userInfo);
            threadA.setName("a");
            threadA.start();
            Thread.sleep(50);
            ThreadB threadB = new ThreadB(service, userInfo);
            threadB.setName("b");
            threadB.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
