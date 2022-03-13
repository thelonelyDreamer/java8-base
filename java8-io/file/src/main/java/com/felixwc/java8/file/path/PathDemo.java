package com.felixwc.java8.file.path;

import com.felixwc.java8.file.utils.ClassesUtils;

import java.nio.file.Path;

/**
 * in order to learn java!
 * created at 2022/3/4 11:02
 *
 * @author wangchao
 */
public class PathDemo {
    private static Path path = ClassesUtils.getClassPath();

    // 获得相对路径
    public static void relativize(){
        Path resolve = path.resolve("./demo.properties");
        Path relativize = path.relativize(resolve);
        System.out.println(relativize);
    }

    // 解析路径
    public static void resolvePath(){
//        path.resolve();
//        path.resolveSibling();
    }


    public static void otherMethod(){
        // 整理路径
        path.normalize();
        // 绝对路径
        path.toAbsolutePath();

        // 判断路径类型
        path.isAbsolute();
    }

    public static void main(String[] args) {
        relativize();
        System.out.printf("%d\n",new Integer(1));
    }
}
