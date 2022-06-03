package com.felixwc.pattern.request;

/**
 * in order to learn java!
 * created at 2022/6/3 14:22
 *
 * @author felixwc
 */
public class ConcreteRequest<T> implements Request<T> {

    private RequestType type;

    @Override
    public RequestType getRequestType() {
        return this.type;
    }

    @Override
    public void setRequestType(RequestType type) {
        this.type=type;
    }
}
