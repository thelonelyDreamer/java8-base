package com.felixw.java8.mail.client;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import java.io.IOException;
import java.util.Properties;

/**
 * in order to learn java!
 * created at 2021/8/24 14:50
 *
 * @author wangchao
 */
public class SessionFactory {
    private final Session session;
    public SessionFactory(String smtpServer,String username,String password) throws IOException {
        Properties props = new Properties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.class", "com.sun.mail.smtp.SMTPTransport");
        props.put("mail.smtp.host",smtpServer); //设置发送邮件服务器
        props.put("mail.smtp.port", "25");
        props.put("mail.smtp.auth", "true"); //SMTP服务器需要身份验证
        props.put("mail.store.protocol","pop3");
        session = Session.getInstance(props, new Authenticator() {
            // 验证账号
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username,password);
            }
        });
//        session.setDebug(true);//输出跟踪日志
    }

    public Session getSession() {
        return session;
    }
}
