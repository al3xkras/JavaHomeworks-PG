package com.al3xkras.java_homeworks_pg.lab1;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(forSum(100));
        System.out.println(littleGauss(100));
        System.out.println(recursiveSum(0,100));
    }
    static long forSum(int num){
        long sum=0;
        for (int i=1; i<=num; i++){
            sum+=i;
        }
        return sum;
    }
    static long littleGauss(int num){
        return ((long)num*(num+1))/2;
    }
    static long recursiveSum(int start, int end){
        if (start>end)
            return 0;
        if (start==end){
            return start;
        }
        if (end-start==1){
            return end+start;
        }
        int end1 = (start+end)/2;
        int start2 = end1+1;
        return recursiveSum(start,end1)+recursiveSum(start2,end);
    }
}
