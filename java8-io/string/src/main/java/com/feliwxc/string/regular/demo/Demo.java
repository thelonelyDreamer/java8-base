package com.feliwxc.string.regular.demo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * in order to learn java!
 * created at 2022/3/4 11:47
 *
 * @author wangchao
 */
public class Demo {

    // 匹配QQ号码
    public static void testQQ(){
        Pattern pattern = Pattern.compile("[1-9][0-9]{4,11}");
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.printf("输入一个字符串:");
            String s = scanner.nextLine();
            if(s==null||s.equals("")) return;
            Matcher matcher = pattern.matcher(s);
            if(matcher.matches()){
                System.out.println(matcher.group());
            }else {
                System.out.println("no match");
            }
        }
    }

    public static void main(String[] args) {
        testQQ();
    }
}
