package org.example;

import org.example.boot.TCPServer;

import java.io.IOException;

public class TCPServerBoot {
    public static void main(String[] args) throws IOException {
        new TCPServer(12345).start();
    }
}