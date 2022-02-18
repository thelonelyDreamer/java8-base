package com.felixwc.java8.data.structure.bitset.sieve;

import java.util.BitSet;

/**
 * in order to learn java!
 * created at 2022/1/7 22:26
 *
 * @author wangchao
 */
public class Sieve {
    public static void test(){
        int n = 100000000;
        long start = System.currentTimeMillis();
        BitSet bitSet = new BitSet(n + 1);
        int count =0;
        int i=0;
        for(i=2;i<=n;i++){
            bitSet.set(i);
        }
        i=2;
        while (i*i<=n){
            if(bitSet.get(i)){
                count++;
                int k=2*i;
                while (k<=n){
                    bitSet.clear(k);
                    k+=i;
                }
            }
            i++;
        }
        while (i<=n){
            if(bitSet.get(i)) count++;
            i++;
        }
        long end = System.currentTimeMillis();
        System.out.println(count + " primes");
        System.out.println((end-start)+"milliseconds");
    }

    public static void main(String[] args) {
        Sieve.test();
    }
}
