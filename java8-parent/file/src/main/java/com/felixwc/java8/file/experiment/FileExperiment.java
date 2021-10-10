package com.felixwc.java8.file.experiment;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.StandardCopyOption;

/**
 * in order to learn java!
 * created at 2021/8/24 04:26
 *
 * @author wangchao
 */

public class FileExperiment {
    public static void doExperiment1() throws IOException {

        // 文件的创建
        File file = new File("./file/abc.txt");
        file.createNewFile();
        // 文件的重命名
        File file1 = new File("./file/abd.txt");
        file.renameTo(file1);
        // 文件的剪切和移动
        File file2 = new File("./file/file/abd.txt");
        file2.getParentFile().mkdir();
        file1.renameTo(file2);
        // 文件的复制
        Files.copy(file2.toPath(), new File("./file/final.txt").toPath(),
                LinkOption.NOFOLLOW_LINKS, StandardCopyOption.REPLACE_EXISTING);
        // 文件的删除
        file.deleteOnExit();
        file1.deleteOnExit();
        file2.deleteOnExit();
    }



    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        doExperiment1();
    }
}
