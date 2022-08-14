package com.felixwc.nio.qs.buffer;

import org.junit.Test;

import java.nio.ByteBuffer;

import static org.junit.Assert.*;

public class BufferDemoTest {

    @Test
    public void test(){
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(1024);
        System.out.println(byteBuffer.isDirect());
        System.out.println(byteBuffer.isReadOnly());
    }

}