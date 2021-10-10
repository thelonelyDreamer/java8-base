package com.felixwc.java8.concurrent.annotation;

import org.junit.Test;

import static org.junit.Assert.*;

public class ImmutableExperienceTest {

    @Test
    public void test1() {
        ImmutableExperience a = new ImmutableExperience(1, "a");
        a.setNum(2);
        System.out.println(a);
    }
}