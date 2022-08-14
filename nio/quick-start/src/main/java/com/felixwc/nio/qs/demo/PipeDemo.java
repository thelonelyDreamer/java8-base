package com.felixwc.nio.qs.demo;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;

/**
 * in order to learn java!
 * created at 2022/8/10 17:32
 *
 * @author felixwc
 */
public class PipeDemo {
    public static void pipeDemo() throws IOException {
        // 1.获取管道
        Pipe pipe = Pipe.open();
        // 2. 获取缓冲区
        ByteBuffer buf = ByteBuffer.allocate(1024);
        Pipe.SinkChannel sink = pipe.sink();
        buf.put("发送数据".getBytes("utf-8"));
        buf.flip();
        sink.write(buf);
        Pipe.SourceChannel source = pipe.source();
        int read = source.read(buf);
        System.out.println(new String(buf.array(),0,read));
        source.close();
        sink.close();
    }

    public static void main(String[] args) throws IOException {
        pipeDemo();
    }
}
