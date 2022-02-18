package com.felixwc.java8.type.number;

import java.math.BigInteger;

/**
 * in order to learn java!
 * created at 2022/1/22 01:19
 *
 * @author wangchao
 */
public class BigIntegerDemo {
    // 用long 类型构造大数
    private static BigInteger bigInteger1 = BigInteger.valueOf(1L);
    private static BigInteger bigInteger2 = BigInteger.valueOf(2L);

    private static void operateNum(){
        // 加 减乘除
        bigInteger1.add(bigInteger2);
        bigInteger1.subtract(bigInteger2);
        bigInteger1.multiply(bigInteger2);
        bigInteger1.divide(bigInteger2);
        //还有其他 具体看文档
    }

    public static void main(String[] args) {

    }
}
