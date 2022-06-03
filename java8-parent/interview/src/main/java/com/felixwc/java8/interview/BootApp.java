package com.felixwc.java8.interview;

import java.util.Scanner;

/**
 * in order to learn java!
 * created at 2021/11/29 23:55
 *
 * @author wangchao
 */
public class BootApp {

    public static void main(String[] args) {

    }

    public static void solve() {
        long start = System.currentTimeMillis();
        int n = new Scanner(System.in).nextInt();
        int[] arr = new int[n+1];
        int count =0;
        for(int i =0;i<arr.length;i++){
            arr[i]=0;
        }
        int x =1;
        while (x>0){
//            System.out.println(x);
            arr[x]++;
            while (arr[x]<=n&&(!check(arr,x))){
                arr[x]++;
            }
            if(arr[x]<=n){
                if(x==n){
                   count++;
                   print(arr);
                   arr[x]=0;
                   x--;
                }else{
                    x++;
                }
            }else{
                arr[x]=0;
                x--;
            }
        }
        System.out.println(count);
        long end = System.currentTimeMillis();
        System.out.println("program 运行时间：" + (end - start));
    }

    private static void print(int[] arr){
        for(int i =1;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(j==arr[i]){
                    System.out.print("x");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    private static boolean check(int[] arr,int j){
        for(int i=1;i<j;i++){
            if(Math.abs(i-j)==Math.abs(arr[i]-arr[j])||arr[i]==arr[j]){
                return false;
            }
        }
        return true;
    }
}