package com.felixwc.java8.httpclient.tools.httprequest;

import org.apache.http.client.methods.HttpGet;

import java.util.Map;

/**
 * in order to learn java!
 * created at 2021/10/29 15:08
 *
 * @author wangchao
 */
public class GetRequestMap {
    private Map map;

    public GetRequestMap(String[] urls) {
        for (int i = 0; i < urls.length; i++) {
            map.put(urls[i],new HttpGet(urls[i]));
        }
    }
}
