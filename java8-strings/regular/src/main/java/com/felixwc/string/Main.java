package com.felixwc.string;

import org.openjdk.jol.info.ClassLayout;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * in order to learn java!
 * created at 2022/8/22 17:25
 *
 * @author felixwc
 */
public class Main {
    public static void main(String[] args) {
        Pattern test = Pattern.compile("test",Pattern.CASE_INSENSITIVE);
        String s = "test";
        Matcher matcher = test.matcher(s);
        System.out.println(matcher.find(1));
    }

    private static void parseObject(){
        char[] chars = "我是中国人".toCharArray();
        System.out.println(ClassLayout.parseInstance(chars).toPrintable());
    }
}
