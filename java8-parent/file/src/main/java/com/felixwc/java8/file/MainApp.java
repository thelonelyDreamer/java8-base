package com.felixwc.java8.file;

import com.felixwc.java8.file.properties.Demo;

/**
 * in order to learn java!
 * created at 2021/8/24 02:27
 *
 * @author wangchao
 */
public class MainApp {
    public static void main(String[] args) {
        Demo.update("test","test");
        Demo.list();
    }
}
