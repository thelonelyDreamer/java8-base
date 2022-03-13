package com.felixwc.java8.file.utils;


import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 * in order to learn java!
 * created at 2022/3/4 10:03
 *
 * @author wangchao
 */
public class FilesDemo {
    private static Path demo = ClassesUtils.getClassPath().resolve("./demo.properties");
    // 读取文件
    public static void readFile() throws IOException {
        List<String> strings = Files.readAllLines(ClassesUtils.getClassPath().resolve("./demo.properties")
                , Charset.forName("utf-8"));
        strings.stream().forEach(System.out::println);
    }
    // 读取文件到字节数组
    public static void readFile2() throws IOException {
        byte[] bytes = Files.readAllBytes(ClassesUtils.getClassPath().resolve("./demo.properties"));
        String string = new String(bytes);
        System.out.println(string);
    }

    // 写文件
    public static void writeFile() throws IOException {
        String context = System.lineSeparator()+"context";
        byte[] bytes = context.getBytes(Charset.forName("utf-8"));
        Files.write(demo,bytes, StandardOpenOption.APPEND);
    }

    public static void main(String[] args) throws Exception{
        writeFile();
        readFile();
    }
}
