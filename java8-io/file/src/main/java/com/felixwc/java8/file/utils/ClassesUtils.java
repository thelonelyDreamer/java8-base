package com.felixwc.java8.file.utils;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * in order to learn java!
 * created at 2022/3/4 10:13
 *
 * @author wangchao
 */
public class ClassesUtils {

    public static Path getClassPath(){
        URL resource = ClassesUtils.class.getResource("/");
        try {
            return Paths.get(new URI(resource.toString()));
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        getClassPath();
    }
}
