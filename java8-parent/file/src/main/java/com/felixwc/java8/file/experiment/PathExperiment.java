package com.felixwc.java8.file.experiment;

import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;

/**
 * in order to learn java!
 * created at 2021/8/24 02:35
 *
 * @author wangchao
 */
public class PathExperiment {


    public static void doExperiment1(){
        String property = System.getProperty("user.dir");
        File file = new File(property);
        Arrays.stream(file.list()).forEach(System.out::println);
        Path path = file.toPath();
        Path a = path.resolve("a");
        System.out.println(a.endsWith("a"));
    }
}
