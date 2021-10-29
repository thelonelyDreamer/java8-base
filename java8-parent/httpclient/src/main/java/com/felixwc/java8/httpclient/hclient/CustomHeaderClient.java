package com.felixwc.java8.httpclient.hclient;

import org.apache.http.Header;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.util.LinkedList;

/**
 * in order to learn java!
 * created at 2021/10/29 11:55
 *
 * @author wangchao
 */
public class CustomHeaderClient {

    public static HttpClient ClientWithHeader(){
        LinkedList<Header> headers = new LinkedList<>();
        CloseableHttpClient httpClient = HttpClients.custom().setDefaultHeaders(headers).build();
        return httpClient;
    }
}
