package com.felixwc.pattern.handler;

import com.felixwc.pattern.request.Request;
import com.felixwc.pattern.request.RequestType;

/**
 * in order to learn java!
 * created at 2022/6/3 14:24
 *
 * @author felixwc
 */
public class Type2Handler<T> implements ResponsibilityHandler<T>{
    private ResponsibilityHandler handler;

    public Type2Handler(ResponsibilityHandler handler) {
        this.handler = handler;
    }

    @Override
    public T handleRequest(Request request) {
        if(request.getRequestType()== RequestType.TYPE2){
            return handleLocalRequest(request);
        }else{
            return (T)handler.handleRequest(request);
        }
    }

    public T handleLocalRequest(Request request){
        System.out.println(this.getClass().getName());
        return null;
    }
}
