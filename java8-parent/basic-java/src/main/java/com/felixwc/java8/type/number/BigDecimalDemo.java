package com.felixwc.java8.type.number;

import java.math.BigDecimal;

/**
 * in order to learn java!
 * created at 2022/1/22 01:19
 *
 * @author wangchao
 */
public class BigDecimalDemo {
    // 用long 类型构造大数
    private static BigDecimal BigDecimal1 = BigDecimal.valueOf(1L);
    private static BigDecimal BigDecimal2 = BigDecimal.valueOf(2L);

    private static void operateNum(){
        // 加 减乘除
        BigDecimal1.add(BigDecimal2);
        BigDecimal1.subtract(BigDecimal2);
        BigDecimal1.multiply(BigDecimal2);
        BigDecimal1.divide(BigDecimal2);
        //还有其他 具体看文档
    }

    public static void main(String[] args) {

    }
}
