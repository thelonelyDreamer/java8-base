package com.felixwc.java8.juc.key.sync.demo2;

/**
 * in order to learn java!
 * created at 2022/1/25 00:33
 *
 * @author wangchao
 */
public class Service {
    public void serviceMethodA(UserInfo userInfo){
        synchronized (userInfo){
            try{
                System.out.println(Thread.currentThread().getName());
                userInfo.setUsername(Thread.currentThread().toString());
                Thread.sleep(3000);
                System.out.println("end! time="+System.currentTimeMillis());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
