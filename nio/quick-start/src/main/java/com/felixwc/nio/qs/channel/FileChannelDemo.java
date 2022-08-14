package com.felixwc.nio.qs.channel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * in order to learn java!
 * created at 2022/8/11 10:22
 *
 * @author felixwc
 */
public class FileChannelDemo {

    public static void test() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("1.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("2.txt");
        FileChannel fic = fileInputStream.getChannel();
        FileChannel foc = fileOutputStream.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        while (fic.read(buffer)!=-1){
            buffer.flip();
            foc.write(buffer);
            buffer.clear();
        }
        fic.close();
        foc.close();
        fileInputStream.close();
        fileOutputStream.close();
    }
}
