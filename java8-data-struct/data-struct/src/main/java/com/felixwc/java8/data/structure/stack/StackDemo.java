package com.felixwc.java8.data.structure.stack;

import java.util.Stack;

/**
 * in order to learn java!
 * created at 2022/1/7 17:45
 * stack 被启用 继承vector 性能低
 * @author wangchao
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack<String> strings = new Stack<>();
        // push 方法 入栈
        strings.push("abc");
        // peek 方法 查看栈顶元素
        String peek = strings.peek();
        //System.out.println(peek);
        // pop 方法出栈 栈空则抛出非受检异常 EmptyStackException
        String pop = strings.pop();
        //System.out.println(strings.pop());
    }
}


