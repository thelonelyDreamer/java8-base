package com.felixwc.java8.httpclient.concurrent;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * in order to learn java!
 * created at 2021/10/29 12:02
 *
 * @author wangchao
 */
public class SimpleGetMulTest {
    private static HttpClient httpClient =
            HttpClients.createDefault();
    public static AtomicInteger i = new AtomicInteger(0);

    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    HttpGet httpGet = new HttpGet("http://www.sina.com.cn");
                    HttpResponse response = httpClient.execute(httpGet);
                    HttpEntity entity = response.getEntity();
                    InputStream content = entity.getContent();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(content));
                    String s = bufferedReader.readLine();
                    while(s!=null){
                        System.out.println(s);
                        s=bufferedReader.readLine();
                    }
                    System.out.println(i.incrementAndGet());
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                }
            }
        };
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for(int i =1;i<=20;i++) executorService.submit(task);
        executorService.shutdown();
        System.out.println(i);
    }



}
