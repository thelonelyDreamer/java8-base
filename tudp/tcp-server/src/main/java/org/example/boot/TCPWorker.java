package org.example.boot;

import java.io.*;
import java.net.Socket;
import java.util.Objects;

/**
 * in order to learn java!
 * created at 2022/11/12 13:27
 *
 * @author felixwc
 */
public class TCPWorker extends Thread{
    private Socket socket;
    private BufferedReader reader;
    private PrintWriter writer;

    public TCPWorker(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            System.out.println(socket.getInetAddress());
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(socket.getOutputStream());
            String readline=reader.readLine();
            while(Objects.nonNull(readline)){
                System.out.println("Client:" + readline);
                writer.println(readline+"server");
                writer.flush();
                readline = reader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(reader!=null){
                    reader.close();
                }
                if(writer!=null){
                    writer.close();
                }
                if(socket!=null){
                    socket.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
