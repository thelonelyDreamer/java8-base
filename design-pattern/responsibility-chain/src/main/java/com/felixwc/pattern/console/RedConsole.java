package com.felixwc.pattern.console;

import com.felixwc.pattern.handler.EndHandler;
import com.felixwc.pattern.handler.Type1Handler;
import com.felixwc.pattern.handler.Type2Handler;
import com.felixwc.pattern.handler.TypeHandler;
import com.felixwc.pattern.request.ConcreteRequest;
import com.felixwc.pattern.request.Request;
import com.felixwc.pattern.request.RequestType;

/**
 * in order to learn java!
 * created at 2022/6/3 14:35
 *
 * @author felixwc
 */
public class RedConsole {

    public static  void start(){
        Request<String> request = new ConcreteRequest<>();
        EndHandler<String> endHandler = new EndHandler<>();
        Type2Handler<String> type2Handler = new Type2Handler<>(endHandler);
        Type1Handler<String> type1Handler = new Type1Handler<>(type2Handler);
        TypeHandler<String> typeHandler = new TypeHandler<>(type1Handler);
        System.out.println("============================");
        typeHandler.handleRequest(request);
        System.out.println("============================");
        request.setRequestType(RequestType.TYPE1);
        typeHandler.handleRequest(request);
        System.out.println("============================");
        request.setRequestType(RequestType.TYPE2);
        typeHandler.handleRequest(request);
        System.out.println("============================");
        request.setRequestType(RequestType.TYPE3);
        typeHandler.handleRequest(request);
    }

    public static void main(String[] args) {
        start();
    }
}
