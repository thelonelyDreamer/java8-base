package com.felixwc.pattern.p1;

import com.felixwc.pattern.p1.strategy.StrategyA;
import org.junit.Test;

/**
 * in order to learn java!
 * created at 2022/9/14 15:46
 *
 * @author felixwc
 */
public class TestClass {

    @Test
    public void test(){
        Context context = new Context(new StrategyA());
        context.executeStrategy();
    }
}
