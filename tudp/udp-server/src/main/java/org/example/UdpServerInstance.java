package org.example;

import lombok.Data;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * in order to learn java!
 * created at 2022/11/12 09:29
 *
 * @author felixwc
 */
public class UdpServerInstance {

    private volatile boolean running =false;
    private ExecutorService threadPool;
    private   DatagramSocket socket=null;
    private BlockingQueue<UDPMessage> messageQueue;
    private Thread messageObserve;
    private AtomicInteger messageCount;

    // 开启服务器
    public void start() throws SocketException {
        if(running) return;
        // 启动参数的设置
        running = true;
        messageCount = new AtomicInteger(0);
        // 初始化线程池
        threadPool = new ThreadPoolExecutor(4, 20, 120, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(100), new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r);
            }
        },new ThreadPoolExecutor.CallerRunsPolicy());
        // 初始化队列
        messageQueue = new LinkedBlockingQueue<>();
        socket = new DatagramSocket(12345);
        messageObserve = new Thread(()->{
            while (running){
                try {
                    UDPMessage message = messageQueue.take();
                    System.out.println(new String(message.getBytes(),0, message.length, StandardCharsets.UTF_8));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        messageObserve.start();
        deal();
    }

    // 处理请求
    public void deal(){

        while (running){
            try {
                byte[] buf = new byte[1024];
                DatagramPacket packet = new DatagramPacket(buf, buf.length);
                socket.receive(packet);
                UDPMessage udpMessage = new UDPMessage();
                udpMessage.setBytes(buf);
                udpMessage.setLength(packet.getLength());
                messageQueue.add(udpMessage);
                messageCount.incrementAndGet();
            } catch (IOException e) {
                stop();
            }
        }
    }
    // 服务器停止
    public void stop(){
        if(socket!=null){
            socket.close();
        }
        // 终止参数
        running =false;
    }

    // 接收包的封装
    @Data
    public static class UDPMessage{
        private byte[] bytes;
        private int length;
    }


    // 接收包的总数
    public AtomicInteger getMessageCount() {
        return messageCount;
    }
}
