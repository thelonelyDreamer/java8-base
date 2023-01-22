package org.example;

import org.example.loader.CustomClassLoader;
import org.example.pojo.Person;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;

public class Main {
    private static String string ="F:\\code-note\\github\\java8-base\\jvm\\ClassLoader\\target\\classes\\org\\example\\pojo\\";
    public static void main(String[] args) throws ClassNotFoundException, InterruptedException, InstantiationException, IllegalAccessException {
        CopyOnWriteArrayList<Class> classes = new CopyOnWriteArrayList<>();
        CountDownLatch countDownLatch = new CountDownLatch(2);
        Thread thread = new Thread(() -> {
            try {
                Class<?> aClass = Thread.currentThread().getContextClassLoader().loadClass("Person");
                classes.add(aClass);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            countDownLatch.countDown();
        });
        thread.setContextClassLoader(new CustomClassLoader(string));

        Thread threadA = new Thread(() -> {
            try {
                Class<?> aClass = Thread.currentThread().getContextClassLoader().loadClass("Person");
                System.out.println(2);
                Object o = aClass.newInstance();
                System.out.println("A"+(aClass==Person.class));
                classes.add(aClass);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
            countDownLatch.countDown();
        });
        threadA.setContextClassLoader(new CustomClassLoader(string));
        threadA.start();
        thread.start();
        countDownLatch.await();
        System.out.println(classes.get(1)==classes.get(0));
        Object o = classes.get(0).newInstance();

        System.out.println(o instanceof Person);
    }
}