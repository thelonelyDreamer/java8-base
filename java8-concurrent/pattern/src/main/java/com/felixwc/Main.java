package com.felixwc;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("1");
        System.out.println(strings.size());
        System.out.println(strings.remove(0));
        System.out.println(strings.size());
    }
}