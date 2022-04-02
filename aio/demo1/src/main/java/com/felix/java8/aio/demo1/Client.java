package com.felix.java8.aio.demo1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

/**
 * in order to learn java!
 * created at 2022/3/13 20:22
 *
 * @author wangchao
 */
public class Client {
    public static void main(String[] args) throws IOException, InterruptedException {
        AsynchronousSocketChannel socket = AsynchronousSocketChannel.open();
        socket.connect(new InetSocketAddress("127.0.0.1", 9999));

        Thread.sleep(1000 * 2);

        socket.write(ByteBuffer.wrap("你好服务器，我是客户端，收到请回复！".getBytes()), null, new CompletionHandler<Integer, Void>() {
            @Override
            public void completed(Integer result, Void attachment) {
                System.out.println("客户端发送请求完毕！");
            }

            @Override
            public void failed(Throwable exc, Void attachment) {

            }
        });

        ByteBuffer buf = ByteBuffer.allocate(1024);
        socket.read(buf, null, new CompletionHandler<Integer, Void>() {
            @Override
            public void completed(Integer len, Void attachment) {
                String msg = new String(buf.array(), 0, len);
                System.out.println("客户端收到消息：" + msg);
            }

            @Override
            public void failed(Throwable exc, Void attachment) {

            }
        });

        Thread.sleep(100000);
    }
}
