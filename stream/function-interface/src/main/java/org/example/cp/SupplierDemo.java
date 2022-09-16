package org.example.cp;

import org.junit.Test;

import java.util.function.Supplier;

/**
 * in order to learn java!
 * created at 2022/9/14 17:35
 *
 * @author felixwc
 */
public class SupplierDemo {
    @Test
    public void test(){
        Supplier<String> supplier =()->"app";
        System.out.println(supplier.get());
    }
}
