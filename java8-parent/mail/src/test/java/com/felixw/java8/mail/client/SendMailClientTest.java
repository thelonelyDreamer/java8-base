package com.felixw.java8.mail.client;

import com.felixw.java8.mail.message.TextMessage;
import org.junit.Test;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SendMailClientTest {

    @Test
    public void sendMassage() throws Exception {
       new SendMailClient("mail.properties").sendMessage(TextMessage.generate());
    }

    @Test
    public void sendMassageByThread() throws Exception {
        ExecutorService theadPool = Executors.newCachedThreadPool();
        MimeMessage message = TextMessage.generate();
        SendMailClient sendMailClient = new SendMailClient("mail.properties");
        for(int i=0;i<10;i++)
        theadPool.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    sendMailClient.sendMessage(message);
                } catch (MessagingException e) {
                    e.printStackTrace();
                }
            }
        });
        theadPool.awaitTermination(10, TimeUnit.MINUTES);
    }
}