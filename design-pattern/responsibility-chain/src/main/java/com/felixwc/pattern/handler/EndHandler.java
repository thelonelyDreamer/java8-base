package com.felixwc.pattern.handler;

import com.felixwc.pattern.request.Request;

/**
 * in order to learn java!
 * created at 2022/6/3 14:40
 *
 * @author felixwc
 */
public class EndHandler<T> implements ResponsibilityHandler{
    @Override
    public T handleRequest(Request request) {
        System.out.println(this.getClass().getName());
        return null;
    }
}
