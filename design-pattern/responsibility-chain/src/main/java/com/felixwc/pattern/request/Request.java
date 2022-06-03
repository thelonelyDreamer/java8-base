package com.felixwc.pattern.request;

/**
 * in order to learn java!
 * created at 2022/6/3 14:15
 *
 * @author felixwc
 */
public interface Request<T> {
    default RequestType getRequestType(){
        return RequestType.TYPE1;
    }

    default void setRequestType(RequestType type){

    }
}
