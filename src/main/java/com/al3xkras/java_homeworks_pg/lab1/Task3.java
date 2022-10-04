package com.al3xkras.java_homeworks_pg.lab1;

import java.util.stream.IntStream;

public class Task3 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,100).mapToObj(x->{
            if (x%5==0){
                return x+" can be divided by 5";
            }
            return x+"";
        }).forEach(System.out::println);
    }
}
