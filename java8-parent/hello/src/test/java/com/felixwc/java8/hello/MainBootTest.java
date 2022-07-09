package com.felixwc.java8.hello;

import org.junit.Test;

public class MainBootTest {

    @Test
    public void main() {

    }

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for(;;){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.start();
    }
}