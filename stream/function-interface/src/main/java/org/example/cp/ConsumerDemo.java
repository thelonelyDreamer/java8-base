package org.example.cp;

import org.junit.Test;

import java.util.function.Consumer;

/**
 * in order to learn java!
 * created at 2022/9/14 17:31
 *
 * @author felixwc
 */
public class ConsumerDemo {
    @Test
    public void test(){
        Consumer<String> consumer = (s)-> System.out.println(s);
        Consumer<String> consumerAnother = consumer.andThen(s -> System.out.println("第二次" + s));
        consumerAnother.accept("t");
    }
}
