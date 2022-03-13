package com.feliwxc.string.regular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * in order to learn java!
 * created at 2021/11/24 14:47
 *
 * @author wangchao
 */
public class SimpleStringPattern {
    public static void demo1() {
        Pattern pattern = Pattern.compile("^[Jj]ava");
        Scanner scanner = new Scanner(System.in);
        String s=null;
        if(scanner.hasNext()){
            s=scanner.next();
        }
        System.out.println("原始字符串：" + s);
        Matcher matcher = pattern.matcher(s);
        if(matcher.matches()) {
            String group = matcher.group();
            System.out.println(group);
        }
    }

    public static void main(String[] args) {
        demo1();
    }
}
