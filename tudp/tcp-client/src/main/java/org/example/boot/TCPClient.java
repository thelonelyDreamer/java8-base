package org.example.boot;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * in order to learn java!
 * created at 2022/11/12 13:01
 *
 * @author felixwc
 */
public class TCPClient {

    public void send() {
        Socket socket=null;
        PrintWriter writer=null;
        BufferedReader reader=null;

        try {
            socket = new Socket("localhost", 12345);
            writer = new PrintWriter(socket.getOutputStream());
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line;
            Scanner scanner = new Scanner(System.in);
            while (!(line=scanner.next()).equalsIgnoreCase("bye")){
                writer.println(line);
                writer.flush();
                System.out.println("Client:" + line);
                System.out.println("Server:" + reader.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
