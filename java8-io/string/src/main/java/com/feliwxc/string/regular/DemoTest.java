package com.feliwxc.string.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * in order to learn java!
 * created at 2022/2/7 22:23
 *
 * @author wangchao
 */
public class DemoTest {
    private static String line = "This order was placed for QT3000! OK?";
    private static String pattern = ".";


    public static void main(String[] args) {
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0) );
        } else {
            System.out.println("NO MATCH");
        }
    }
}
