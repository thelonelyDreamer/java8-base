package com.md5.encode;

import java.security.MessageDigest;

/**
 * in order to learn java!
 * created at 2021/3/15 14:17
 *
 * @author wangchao
 */
public class EncryptByMD5 {

    public static String getEncryptByJDK(String sourceCode){
        String targetCode = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.digest(sourceCode.getBytes());
            byte[] digestCode = md.digest();
            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < digestCode.length; offset++) {//做相应的转化（十六进制）
                i = digestCode[offset];
                if (i < 0) i += 256;
                if (i < 16) buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            targetCode = buf.toString();
        } catch (Exception e){
            e.printStackTrace();
        }
        return targetCode;
    }

}
