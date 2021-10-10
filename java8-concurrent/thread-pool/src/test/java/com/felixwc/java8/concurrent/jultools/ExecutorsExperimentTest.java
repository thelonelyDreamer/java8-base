package com.felixwc.java8.concurrent.jultools;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExecutorsExperimentTest {

    @Test
    public void testReturnTypeName() {
        ExecutorsExperiment.getThreadPoolFactory().stream().forEach(System.out::println);
    }
}