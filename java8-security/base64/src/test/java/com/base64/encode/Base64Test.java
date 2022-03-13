package com.base64.encode;

import org.junit.Test;

/**
 * in order to learn java!
 * created at 2021/3/15 14:39
 *
 * @author wangchao
 */
public class Base64Test {

    @Test
    public void base64CodeTest(){
        String encode = EncodeByBase64.getEncodeByBase64("我说");
        String decodeByBase64 = DecodeByBase64.getDecodeByBase64(encode);
        System.out.println(decodeByBase64);
    }
}
