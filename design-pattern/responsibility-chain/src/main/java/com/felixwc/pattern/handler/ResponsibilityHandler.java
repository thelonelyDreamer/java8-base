package com.felixwc.pattern.handler;

import com.felixwc.pattern.request.Request;

/**
 * in order to learn java!
 * created at 2022/6/3 14:14
 *
 * @author felixwc
 */
public interface ResponsibilityHandler<T> {
    T handleRequest(Request request);
}
