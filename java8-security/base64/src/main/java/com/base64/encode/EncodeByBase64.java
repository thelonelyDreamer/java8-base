package com.base64.encode;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * in order to learn java!
 * created at 2021/3/15 14:33
 *
 * @author wangchao
 */
public class EncodeByBase64 {

    public static String getEncodeByBase64(String source){
        String target =null;
        try {
            byte[] targetByte = Base64.getEncoder().encode(source.getBytes());
            target = new String(targetByte,"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return target;
    }

}
