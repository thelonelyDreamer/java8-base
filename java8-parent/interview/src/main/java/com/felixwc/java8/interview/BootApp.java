package com.felixwc.java8.interview;

import java.util.Stack;

/**
 * in order to learn java!
 * created at 2021/11/29 23:55
 *
 * @author wangchao
 */
public class BootApp {
    public static void main(String[] args) {
        int a =3;
        int b=3;
        String c = "3";
        System.out.println(a+b+c);

    }

    public static String solve(String str, int k) {
        if (str == null || k <= 0) {
            return str;
        }
        if (k >= str.length()||str.length()==0) {
            return String.valueOf(0);
        }
        int deleted = 0;
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while ( i < str.length()) {
            char c = str.charAt(i);
            while (!stack.empty()&&c<stack.peek()&&deleted<k){
                deleted++;
                stack.pop();
            }
            i++;
            stack.push(c);
        }
        int remain = k-deleted;
        if(remain>0){
            for (int j = 0; j < remain ; j++) {
                stack.pop();
            }
        }
        char[] chars = new char[str.length() - k];
        int notZero = chars.length;
        for(int j=chars.length-1;j>=0;j--){
            Character c = stack.pop();
            if(c!='0') notZero =j;
            chars[j] =c;
        }
        String res;
        if(notZero==chars.length){
            res = String.valueOf(0);
        }else{
            res = String.valueOf(chars).substring(notZero);
        }
        return res;
    }
}