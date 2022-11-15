package com.al3xkras.java_homeworks_pg.lab5;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Task5_1 {
    public static void main(String[] args) {
        Set<Integer> lotto = new HashSet<>();
        while (lotto.size()<6){
            lotto.add(ThreadLocalRandom.current().nextInt(1,50));
        }
        System.out.println(lotto);
    }
}
