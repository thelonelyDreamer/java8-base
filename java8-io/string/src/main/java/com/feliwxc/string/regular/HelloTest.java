package com.feliwxc.string.regular;

import java.util.regex.Pattern;

/**
 * in order to learn java!
 * created at 2021/11/24 14:36
 *
 * @author wangchao
 */
public class HelloTest {
    public static  void test(){
        Pattern commas = Pattern.compile("\\s*,\\s*");
        String target = "sdd,dfasdf,dfa,df";
        String[] split = commas.split(target);
        for (String s : split) {
            System.out.println(s);
        }
        String[] ds = target.split("d");
        for (String d : ds) {
            System.out.println(d);
        }
    }


}
