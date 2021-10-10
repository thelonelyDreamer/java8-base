package com.felixw.java8.mail.client;

import javax.annotation.concurrent.ThreadSafe;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import java.io.IOException;

/**
 * in order to learn java!
 * created at 2021/8/24 13:34
 *
 * @author wangchao
 */
@ThreadSafe
public class SendMailClient {
    private final Session session;

    public SendMailClient(String configPath) throws IOException {
        ClientConfig config = new ClientConfig("mail.properties");
        this.session= new SessionFactory(config.getSmtpServer(),config.getUsername(),config.getPassword()).getSession();
    }

    public Transport getTransport() throws MessagingException {
        Transport transport = session.getTransport();
        return transport;
    }

    public void sendMessage(Message message) throws MessagingException {
        Transport transport = getTransport();
        transport.connect();
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
    }
}
