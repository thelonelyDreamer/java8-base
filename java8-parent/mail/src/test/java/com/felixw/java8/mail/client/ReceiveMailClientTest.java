package com.felixw.java8.mail.client;

import org.junit.Test;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Store;
import java.io.IOException;

public class ReceiveMailClientTest {
    @Test
    public void test1() throws Exception {
        final ReceiveMailClient receiveMailClient = new ReceiveMailClient("mail.properties", null);
        Message[] messages = receiveMailClient.receiveMail("INBOX");
        for (Message message : messages) {
            System.out.println(message.getSubject());
        }
    }

    @Test
    public void test2() throws IOException, MessagingException {
        final ReceiveMailClient receiveMailClient = new ReceiveMailClient("mail.properties", null);
        Store store = receiveMailClient.getStore();
        store.connect(receiveMailClient.getPop3Server(),receiveMailClient.getUsername(),receiveMailClient.getPassword());

        System.out.println(" ");
    }
}