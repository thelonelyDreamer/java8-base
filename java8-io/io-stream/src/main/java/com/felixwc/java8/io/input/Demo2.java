package com.felixwc.java8.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * in order to learn java!
 * created at 2022/3/3 16:46
 *
 * @author wangchao
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        InputStream charTable = Demo2.class.getClassLoader().getResourceAsStream("char.txt");
        Scanner scanner = new Scanner(charTable);
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
}
