package org.example;

import java.net.SocketException;
import java.util.concurrent.TimeUnit;

public class UDPServer {
    public static void main(String[] args) {
        UdpServerInstance udpServerInstance = new UdpServerInstance();
        new Thread(()->{
            try {
                udpServerInstance.start();
            } catch (SocketException e) {
                udpServerInstance.stop();
            }
        }).start();
        new Thread(()->{
            while (true){
                try {
                    System.out.println(udpServerInstance.getMessageCount().get());
                    TimeUnit.SECONDS.sleep(3);
                } catch (Throwable e) {
                    System.out.println(e.getMessage());
                }
            }
        }).start();
    }
}