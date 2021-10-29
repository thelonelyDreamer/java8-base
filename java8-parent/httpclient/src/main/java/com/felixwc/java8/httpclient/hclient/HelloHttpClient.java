package com.felixwc.java8.httpclient.hclient;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * in order to learn java!
 * created at 2021/10/29 11:24
 *
 * @author wangchao
 */
public class HelloHttpClient {

    public static void hi() throws IOException {
        CloseableHttpClient client = HttpClients.createDefault();
        while (true) {
            HttpGet httpGet = new HttpGet("http://www.baidu.com");
            CloseableHttpResponse response = client.execute(httpGet);
            HttpEntity entity = response.getEntity();
            InputStream content = entity.getContent();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(content));
            String s = bufferedReader.readLine();
            while(s!=null){
                System.out.println(s);
                s=bufferedReader.readLine();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        hi();
    }
}
