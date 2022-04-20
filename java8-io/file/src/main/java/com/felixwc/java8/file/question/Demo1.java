package com.felixwc.java8.file.question;

import java.io.File;
import java.io.IOException;

/**
 * in order to learn java!
 * created at 2022/4/19 19:54
 *
 * @author felixwc
 */
public class Demo1 {
    // 创建与一个文件同目录的文件
    public static void test(File file) throws IOException {
        File file1 = new File(file.getParent(), "b.txt");
        if(!file1.exists()){
            file1.createNewFile();
        }
    }

    public static void main(String[] args) throws IOException {
        test(new File("./file/final.txt"));
    }
}
