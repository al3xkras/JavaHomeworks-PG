package com.al3xkras.java_homeworks_pg.lab5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task5_2 {
    public static void main(String[] args) {
        int n = 1000;
        int nextPrime = 2;
        List<Integer> primes = new ArrayList<>();
        TreeSet<Integer> M = IntStream.rangeClosed(3,n)
                .boxed().collect(Collectors.toCollection(TreeSet::new));
        Set<Integer> S = new HashSet<>();
        while (M.size()>0) {
            for (int mul = 1; mul * nextPrime <= n; mul++) {
                S.add(mul * nextPrime);
            }
            M.removeAll(S);
            S.clear();
            primes.add(nextPrime);
            try {
                nextPrime = M.higher(nextPrime);
            } catch (NullPointerException e){
                break;
            }
        }
        int numsPerRow = 10;
        IntStream.range(0,primes.size()).mapToObj(x->{
            if ((x+1)%(numsPerRow+1)==0){
                return primes.get(x)+"\n";
            }
            return " "+primes.get(x);
        }).forEach(System.out::print);
    }
}
