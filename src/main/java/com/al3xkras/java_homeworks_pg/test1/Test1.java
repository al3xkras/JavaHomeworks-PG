package com.al3xkras.java_homeworks_pg.test1;

import java.util.TreeSet;

public class Test1 {
    public static class Cat extends Animal{
        public Cat() {
            super("cat");
        }
        @Override
        public void sayHello() {
            System.out.println("miau miau");
        }
    }

    public static class Dog extends Animal{
        public Dog(){
            super("dog");
        }
        @Override
        public void sayHello() {
            System.out.println("wuff wuff");
        }
    }

    public static abstract class Animal {
        private String species;
        public Animal(String species) {
            this.species = species;
        }
        public abstract void sayHello();
    }
}
