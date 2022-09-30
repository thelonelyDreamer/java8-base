package org.example.oom;

import java.util.ArrayList;

/**
 * in order to learn java!
 * created at 2022/9/27 14:43
 *
 * @author felixwc
 */
public class HeapOverDemo {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        while (true){
            objects.add(new Object());
        }
    }
}
