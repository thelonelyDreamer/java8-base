package com.felixwc.java8.file.utils;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * in order to learn java!
 * created at 2022/3/4 09:27
 *
 * @author wangchao
 */
public class PathsDemo {

    // 获取类路径
    private static String getAbsoluteClassPath(){
        return PathsDemo.class.getResource("/").toString().substring(6);
    }

    // 拼接路径 windows
    private static void mergeString2path(){
        String pathStr = getAbsoluteClassPath().replace('/', '\\');
        int lastIndexOf = pathStr.lastIndexOf("\\");
        Path path = Paths.get(pathStr.substring(0,lastIndexOf), "demo.properties");
        System.out.println(path.toString());
    }

    //  get(URI) 很重要
    private static void getURIPath() {
        try {
            String s = PathsDemo.class.getResource("/").toString();
            Path path = Paths.get(new URI(s));
            System.out.println(path);
            //F:\代码和笔记\github(稳定的仓库)\java8-base\java8-io\file\target\classes
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    private void hello(){

    }


    public static void main(String[] args) {
        mergeString2path();
        getURIPath();
    }
}
