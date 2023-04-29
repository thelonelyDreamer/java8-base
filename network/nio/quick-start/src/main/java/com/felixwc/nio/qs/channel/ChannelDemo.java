package com.felixwc.nio.qs.channel;

/**
 * in order to learn java!
 * created at 2022/8/11 10:11
 * FileChannel
 * SocketChannel
 * ServerSocketChannel
 * DatagramChannel
 *
 * 三种获取Channel的方法
 * 1. Java 针对支持通道的类提供了getChannel()方法
 *     本地IO:
 *     FileInputStream
 *     FileOutputStream
 *     RandomAccessFile
 *     网络IO:
 *     Socket
 *     ServerSocket
 *     DatagramSocket
 * 2. 在JDK1.7中的NIO.2针对各个通道提供了静态方法open()方法
 * 3. 在JDK1.7中的Files工具类的newByteChannel()方法
 * @author felixwc
 */
public class ChannelDemo{
    public static void test1(){

    }
}
