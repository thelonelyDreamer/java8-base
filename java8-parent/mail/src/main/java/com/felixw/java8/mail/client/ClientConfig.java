package com.felixw.java8.mail.client;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * in order to learn java!
 * created at 2021/8/24 16:41
 *
 * @author wangchao
 */
public class ClientConfig {
    private final String pop3Server;
    private final String username;
    private final String password;
    private final String smtpServer;
    private final String folder;

    public ClientConfig(String configPath) throws IOException {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream(configPath);
        Properties properties = new Properties();
        properties.load(is);
        this.smtpServer = properties.getProperty("pop3Server");
        this.pop3Server = properties.getProperty("smtpServer");
        this.username = properties.getProperty("username");
        this.password = properties.getProperty("password");
        this.folder = properties.getProperty("folder");
    }

    public String getPop3Server() {
        return pop3Server;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSmtpServer() {
        return smtpServer;
    }

    public String getFolder() {
        return folder;
    }
}
