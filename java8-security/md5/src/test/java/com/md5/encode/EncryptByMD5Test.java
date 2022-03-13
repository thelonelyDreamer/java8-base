package com.md5.encode;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptByMD5Test {

    @Test
    public void getEncryptByJDK() {
        String encryptByJDK = EncryptByMD5.getEncryptByJDK("123456");
        System.out.println(encryptByJDK);
    }
}