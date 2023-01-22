package org.example.boot;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * in order to learn java!
 * created at 2022/11/12 13:26
 *
 * @author felixwc
 */
public class TCPServer {
    private ServerSocket server;
    private int port;

    public TCPServer(int port) {
        this.port = port;
    }

    public void start() throws IOException {
        server = new ServerSocket(port);
        while (true){
            Socket socket = server.accept();
            new TCPWorker(socket).start();
        }
    }
}
