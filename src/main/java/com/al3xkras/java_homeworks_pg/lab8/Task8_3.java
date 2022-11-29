package com.al3xkras.java_homeworks_pg.lab8;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task8_3 {

    public static class Person implements Comparable<Person>{
        private final String name;
        public Person(String name) {
            this.name = name;
        }

        @Override
        public int compareTo(Person person) {
            return this.name.compareTo(person.name);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static class Present{
        private final String name;
        private final Integer price;
        public Present(String name, Integer price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public Integer getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Present{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    public static void main(String[] args) {
        Person[] people = new Person[]{
                new Person("a"),
                new Person("b"),
                new Person("c"),
                new Person("d"),
                new Person("e"),
        };
        Present[] presents = new Present[]{
                new Present("p16", 1),
                new Present("p23", 5),
                new Present("p23", 5),
                new Present("p43", 2),
                new Present("p67", 7)
        };
        Map<Person,Present> presentMap = new TreeMap<>();
        for (int i = 0; i < people.length; i++) {
            presentMap.put(people[i],presents[i]);
        }

        double mean = presentMap.values().stream()
                .mapToInt(Present::getPrice)
                .average()
                .orElseThrow();
        long sum = presentMap.values().stream()
                .mapToLong(Present::getPrice)
                .sum();

        presentMap.entrySet().forEach(System.out::println);
        System.out.println();

        System.out.println("sum = "+sum);
        System.out.println("mean = "+mean);
    }
}
