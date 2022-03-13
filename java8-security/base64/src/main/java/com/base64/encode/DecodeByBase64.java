package com.base64.encode;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * in order to learn java!
 * created at 2021/3/15 14:38
 *
 * @author wangchao
 */
public class DecodeByBase64 {

    public static String getDecodeByBase64(String source){
        String target =null;
        try {
            byte[] targetByte = Base64.getDecoder().decode(source.getBytes());
            target = new String(targetByte,"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return target;
    }
}
