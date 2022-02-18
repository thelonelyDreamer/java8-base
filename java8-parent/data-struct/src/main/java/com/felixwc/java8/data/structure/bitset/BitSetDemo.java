package com.felixwc.java8.data.structure.bitset;

import java.util.BitSet;

/**
 * in order to learn java!
 * created at 2022/1/7 21:34
 *
 * @author wangchao
 */
public class BitSetDemo {
    private  static  final  BitSet BIT_SET = new BitSet();
    /**
     * 创建BitSet 获取长度
     */
    public static void createAndObtainLength(){
        // 无参构造默认是64位
        BitSet bitSet = new BitSet(8);
        bitSet.set(64);
        // 获取逻辑长度
        System.out.println(bitSet.length());
    }

    public static void main(String[] args) {
        BIT_SET.set(1);
        System.out.println(BIT_SET.get(1));
        System.out.println(BIT_SET.get(0));
    }
}
