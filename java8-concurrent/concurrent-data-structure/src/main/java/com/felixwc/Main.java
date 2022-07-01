package com.felixwc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<String> strings = new ArrayList<>();
        Collections.synchronizedList(strings);
        Vector<String> strings1 = new Vector<>();
    }
}