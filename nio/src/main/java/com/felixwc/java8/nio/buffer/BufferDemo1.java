package com.felixwc.java8.nio.buffer;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * in order to learn java!
 * created at 2022/1/5 23:04
 *
 * @author wangchao
 */
public class BufferDemo1 {

    public static void main(String[] args) throws IOException {
        File myFile = new File("01.txt");
        myFile.createNewFile();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(myFile.getName()));
        bufferedWriter.write("123467ab啊");
        bufferedWriter.close();
        RandomAccessFile file = new RandomAccessFile("01.txt", "rw");
        FileChannel channel = file.getChannel();
        ByteBuffer allocate = ByteBuffer.allocate(1024);
        int read = channel.read(allocate);
        while (read!=-1){
             allocate.flip();
             while (allocate.hasRemaining()){
                 System.out.println((char)allocate.get());
             }
            allocate.clear();
             read=channel.read(allocate);
        }

    }

}
