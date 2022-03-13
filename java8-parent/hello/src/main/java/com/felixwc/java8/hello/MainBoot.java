package com.felixwc.java8.hello;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.security.SecureRandom;
import java.util.Base64;

/**
 * in order to learn java!
 * created at 2022/1/7 20:52
 *
 * @author wangchao
 */
public class MainBoot {
    public static void main(String[] args) {
        String string = "abc";
        try {
            //生成key
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            //设置密钥长度
            keyGenerator.init(128,new SecureRandom("test".getBytes()));
            //生成密钥对象
            SecretKey secretKey = keyGenerator.generateKey();
            //获取密钥
            byte[] keyBytes = secretKey.getEncoded();
            System.out.println(new String(keyBytes));
            //key转换
            Key key = new SecretKeySpec(keyBytes, "AES");

            //加密
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");

            //初始化，设置为加密
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] result = cipher.doFinal(string.getBytes());
            System.out.println("jdk aes encrypt: " + Base64.getEncoder().encodeToString(result));


            //初始化,设置为解密
            cipher.init(Cipher.DECRYPT_MODE, key);
            result = cipher.doFinal(result);
            System.out.println("jdk aes desrypt:" + new String(result));
            System.out.println(new String(cipher.doFinal(Base64.getDecoder().decode("b6IDgHAbsUzVUHjztOWrdA=="))));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
