package com.felixw.java8.mail.client;

import javax.mail.*;
import java.io.IOException;

/**
 * in order to learn java!
 * created at 2021/8/24 14:47
 *
 * @author wangchao
 */
public class ReceiveMailClient {
    private final Session session;
    private String pop3Server;
    private String username;
    private String password;

    public String getPop3Server() {
        return pop3Server;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public ReceiveMailClient(String configPath, SessionFactory factory) throws IOException {
        ClientConfig config = new ClientConfig(configPath);
        this.pop3Server =config.getPop3Server();
        this.username = config.getUsername();
        this.password = config.getPassword();
        if (null != factory) {
            this.session = factory.getSession();
        } else {
            this.session = new SessionFactory(this.pop3Server,this.username,this.password).getSession();
        }
    }

    public Store getStore() throws NoSuchProviderException {
        return session.getStore();
    }

    public Message[] receiveMail(String folderName) throws Exception {
        Store store = session.getStore();
        store.connect(this.pop3Server,this.username,this.password);
        Folder folder = store.getFolder(folderName);
        if (null == folder) {
            throw new Exception("文件夹不存在");
        }
        folder.open(Folder.READ_ONLY);
        return folder.getMessages();
    }
}
