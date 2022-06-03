package com.felixwc.pattern.handler;

import com.felixwc.pattern.request.Request;

/**
 * in order to learn java!
 * created at 2022/6/3 14:38
 *
 * @author felixwc
 */
public class TypeHandler<T> implements ResponsibilityHandler<T>{
    private ResponsibilityHandler handler;

    public TypeHandler(ResponsibilityHandler handler) {
        this.handler = handler;
    }

    @Override
    public T handleRequest(Request request) {
        System.out.println(this.getClass().getName());
        return (T)handler.handleRequest(request);
    }

}
