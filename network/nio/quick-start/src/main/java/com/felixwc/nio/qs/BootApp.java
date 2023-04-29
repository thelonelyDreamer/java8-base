package com.felixwc.nio.qs;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/**
 * in order to learn java!
 * created at 2022/8/10 17:17
 *
 * @author felixwc
 */
public class BootApp {
    public static void main(String[] args) throws CharacterCodingException {
        //1 获取charset 对象
        Charset charset = Charset.forName("UTF-8");

        //2 获取编码器对象
        CharsetEncoder encoder = charset.newEncoder();

        //3 创建缓冲区
        CharBuffer charBuffer = CharBuffer.allocate(1024);
        charBuffer.put("爱学习");
        charBuffer.flip();
        //4 编码
        ByteBuffer byteBuffer = encoder.encode(charBuffer);
        System.out.println("编码之后");
        for (int i = 0; i < byteBuffer.limit() ; i++) {
            System.out.println(byteBuffer.get());
        }
        //5 解码
        byteBuffer.flip();
        CharsetDecoder decoder = charset.newDecoder();
        CharBuffer decode = decoder.decode(byteBuffer);
        System.out.println("解码之后");
        System.out.println(decode);

        //6 解码异常
//        byteBuffer.flip();
//        Charset gbk = Charset.forName("GBK");
//        CharsetDecoder decoder1 = gbk.newDecoder();
//        CharBuffer decode1 = decoder1.decode(byteBuffer);
//        System.out.println(decode1);
    }
}
