package com.felixwc.java8.file.path;

import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;

/**
 * in order to learn java!
 * created at 2021/12/6 19:06
 *
 * @author wangchao
 */
public class SearchPath {

    public static void main(String[] args) throws IOException {
        String path = SearchPath.class.getResource("/").getFile();
        File file = new File(URLDecoder.decode(path,"utf-8")+"1.properties");
        System.out.println(file.getPath());
        file.createNewFile();
        System.out.println(path);
    }
}
