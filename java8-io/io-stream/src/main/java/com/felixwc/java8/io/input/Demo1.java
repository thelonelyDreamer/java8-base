package com.felixwc.java8.io.input;

import java.io.IOException;
import java.io.InputStream;

/**
 * in order to learn java!
 * created at 2022/3/3 16:46
 *
 * @author wangchao
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        InputStream charTable = Demo1.class.getClassLoader().getResourceAsStream("char.txt");
        int i;
        // 读取一个字节
        while ((i=charTable.read())!=-1){
            System.out.println(i);
        }
    }
}
