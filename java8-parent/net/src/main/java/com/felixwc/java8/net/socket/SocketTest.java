package com.felixwc.java8.net.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * in order to learn java!
 * created at 2021/11/24 17:19
 *
 * @author wangchao
 */
public class SocketTest {
    public static void test() throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
        Socket socket = serverSocket.accept();
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str;
        while ((str = reader.readLine())!=null){
            System.out.println(str);
        }
        reader.close();
        socket.close();
        serverSocket.close();
    }

}
