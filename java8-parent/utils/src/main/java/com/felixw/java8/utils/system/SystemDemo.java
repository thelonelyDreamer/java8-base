package com.felixw.java8.utils.system;

import java.util.Properties;
import java.util.Set;

/**
 * in order to learn java!
 * created at 2022/1/7 21:13
 *
 * @author wangchao
 */
public class SystemDemo {
    /**
     * 列出系统所有的配置
     */
    public static void getAllPropertiesList() {
        // 获取系统配置
        Properties properties = System.getProperties();
        // 获取配置名
        Set<String> names = properties.stringPropertyNames();
        for (String name : names) {
            System.out.println(name+" : "+properties.get(name));
        }
    }

    public static void main(String[] args) {
        SystemDemo.getAllPropertiesList();
    }
}
