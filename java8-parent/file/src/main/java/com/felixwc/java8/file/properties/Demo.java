package com.felixwc.java8.file.properties;

import java.io.*;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.Properties;

/**
 * in order to learn java!
 * created at 2021/12/6 17:29
 *
 * @author wangchao
 */
public class Demo {
    public static final Properties p = new Properties();
    public static final String path = "demo.properties";
    static {
        InputStream stream = Demo.class.getClassLoader().getResourceAsStream(path);
        try {
            p.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 通过key获取value
     * @param key
     * @return
     */
    public static String get(String key) {
        return p.getProperty(key);
    }
    /**
     * 修改或者新增key
     * @param key
     * @param value
     */
    public static void update(String key, String value) {
        p.setProperty(key, value);
        OutputStream oFile = null;
        try {
            String file = Demo.class.getResource("/").getFile();
            File target = new File(URLDecoder.decode(file,"utf-8") + path);
            oFile = new FileOutputStream(target);
            //将Properties中的属性列表（键和元素对）写入输出流
            p.store(oFile, "");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * 通过key删除value
     * @param key
     */
    public static void delete(String key) {
        p.remove(key);
        FileOutputStream oFile = null;
        try {
            oFile = new FileOutputStream(path);
            p.store(oFile, "");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 循环所有key value
     */
    public static void list() {
        Enumeration en = p.propertyNames(); //得到配置文件的名字
        while(en.hasMoreElements()) {
            String strKey = (String) en.nextElement();
            String strValue = p.getProperty(strKey);
            System.out.println(strKey + "=" + strValue);
        }
    }
}
