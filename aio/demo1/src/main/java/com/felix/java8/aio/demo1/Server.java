package com.felix.java8.aio.demo1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

/**
 * in order to learn java!
 * created at 2022/3/13 20:23
 *
 * @author wangchao
 */
public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {
        AsynchronousServerSocketChannel server = AsynchronousServerSocketChannel.open();
        server.bind(new InetSocketAddress(9999));

        System.out.println("开始连接...");
        server.accept(null, new CompletionHandler<AsynchronousSocketChannel, Void>() {
            @Override
            public void completed(AsynchronousSocketChannel socket, Void attachment) {
                System.out.println("有客户端链接...");
                ByteBuffer buf = ByteBuffer.allocate(1024);
                System.out.println("开始读取...");
                socket.read(buf, null, new CompletionHandler<Integer, Void>() {
                    @Override
                    public void completed(Integer len, Void attachment) {
                        String msg = new String(buf.array(), 0, len);
                        System.out.println("服务器收到消息：" + msg);
                    }

                    @Override
                    public void failed(Throwable exc, Void attachment) {

                    }
                });
                System.out.println("结束读取！");

                socket.write(ByteBuffer.wrap("你好客户端，我是服务器，已收到你的消息！".getBytes()), null, new CompletionHandler<Integer, Void>() {
                    @Override
                    public void completed(Integer len, Void attachment) {
                        System.out.println("服务器反馈完毕！");
                    }

                    @Override
                    public void failed(Throwable exc, Void attachment) {

                    }
                });

            }

            @Override
            public void failed(Throwable exc, Void attachment) {

            }
        });
        System.out.println("结束连接！");

        Thread.sleep(1000000000);
    }
}
