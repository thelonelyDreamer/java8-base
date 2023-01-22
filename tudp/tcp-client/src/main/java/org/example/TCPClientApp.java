package org.example;

import org.example.boot.TCPClient;

public class TCPClientApp {
    public static void main(String[] args) {
        int option = 1;
        switch (option) {
            case 1:
                option1();
                break;
            case 2:
                option2();
            default:
                System.out.println("end");
        }
    }

    private static void option2() {
    }

    public static void option1() {
        new TCPClient().send();
    }
}