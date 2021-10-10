package com.felixwc.java8.net.experiment;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;


/**
 * in order to learn java!
 * created at 2021/8/24 01:38
 *
 * @author wangchao
 */
public class ServerSocketExperiment {

    public static void doExperiment1() throws IOException {
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress("localhost",8900));
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while(true){
            String s = bufferedReader.readLine();
            if(null == s) break;
            System.out.println(s);
        }
        BufferedWriter outer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));
        outer.write("hello");
        outer.flush();
        socket.close();
    }

}
