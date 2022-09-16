package com.felixwc.pattern.p1;

/**
 * in order to learn java!
 * created at 2022/9/14 15:36
 *
 * @author felixwc
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public String executeStrategy(){
        return strategy.doSomething();
    }
}
