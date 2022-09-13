package com.felixwc.string.p1;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * in order to learn java!
 * created at 2022/8/23 07:17
 *
 * @author felixwc
 */
public class Demo1 {

    public static void test(){
        Pattern compile = Pattern.compile(".{1,3}");
        Matcher test = compile.matcher("sfeffsdf");
        while(test.find()){
            System.out.println(test.group());
        }

    }

    public static void main(String[] args) {
        solve(12);
    }

    public static Map<Integer,Integer> solve(int n){
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = n+1;i<=2*n;i++){
            if(0==(i*n)%(i-n)){
                map.put((i*n)/(i-n),i);
            }
        }
        Comparator<? super Integer> reversed = map.comparator().reversed();
        TreeMap<Integer, Integer> map1 = new TreeMap<>(reversed);
        map.forEach((t1,t2)->{
            map1.put(t1,t2);
        });
        return map1;
    }
}
