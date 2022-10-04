package com.al3xkras.java_homeworks_pg.lab1;

import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,100).forEach(System.out::println);
    }
}
