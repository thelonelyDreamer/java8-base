package org.example.pojo;

import org.example.common.I1;
import org.example.common.I2;
import org.example.common.I3;

/**
 * in order to learn java!
 * created at 2022/7/6 22:08
 *
 * @author felixwc
 */
public class I implements I1, I2, I3 {


    @Override
    public void method1() {
        System.out.println("method1");
    }

    @Override
    public void method2() {
        System.out.println("method2");
    }

    @Override
    public void method3() {
        System.out.println("method3");
    }

    public static void main(String[] args) {
        I i = new I();
        I1 i1 = i;
        System.out.println(i1 ==i);
    }
}
