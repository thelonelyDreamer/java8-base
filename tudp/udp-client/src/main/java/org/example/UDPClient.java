package org.example;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

public class UDPClient {
    public static void main(String[] args) {
        DatagramSocket socket=null;
        try {
            socket = new DatagramSocket();
            DatagramPacket packet = null;
            int i=10;
            while (i<100) {
                String message = "UDP send dataa is" +i;
                packet = new DatagramPacket(message.getBytes(StandardCharsets.UTF_8),
                        message.getBytes(StandardCharsets.UTF_8).length,
                        InetAddress.getByName("localhost"), 20000);
                socket.send(packet);
                i++;
            }
        }catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(socket!=null){
                socket.close();
            }
        }
    }
}