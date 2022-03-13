package com.feliwxc.string.regular.demo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * in order to learn java!
 * created at 2022/3/4 12:44
 *
 * @author wangchao
 */
public class Demo2 {
    public static void main(String[] args) {
        String target="1234  1234";
        Arrays.stream(target.split("  ")).forEach(System.out::println);
        Scanner scanner = new Scanner(System.in);
        int i=0;
        while (true){
            i++;
            System.out.println(scanner.next()+i);
        }
    }
}
