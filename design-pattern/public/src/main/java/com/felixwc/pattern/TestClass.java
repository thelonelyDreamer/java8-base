package com.felixwc.pattern;

/**
 * in order to learn java!
 * created at 2022/12/6 22:25
 *
 * @author felixwc
 */
public class TestClass implements  TestInterface{

    public String test(){
        return  "test";
    }
    @Override
    public String sayHi() {
        return "hi";
    }

    @Override
    public String sayHello() {
        return test();
    }
}
