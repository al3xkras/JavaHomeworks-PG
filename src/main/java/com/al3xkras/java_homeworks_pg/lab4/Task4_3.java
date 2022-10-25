package com.al3xkras.java_homeworks_pg.lab4;

import com.al3xkras.java_homeworks_pg.lab4.pegasus.Animal;
import com.al3xkras.java_homeworks_pg.lab4.pegasus.impl.Bird;
import com.al3xkras.java_homeworks_pg.lab4.pegasus.impl.Horse;
import com.al3xkras.java_homeworks_pg.lab4.pegasus.impl.Pegasus;

import java.util.Arrays;
import java.util.List;

public class Task4_3 {
    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(
                new Bird("jay"),
                new Horse("charlotte"),
                new Pegasus("peg")
        );

        Pegasus pegasus = new Pegasus("meg");
        Bird bird = (Bird) animals.get(0);
        Horse horse = (Horse) animals.get(1);
        pegasus.fly();
        pegasus.eat();
        pegasus.gallop();
        bird.eat();
        bird.fly();
        horse.eat();
        horse.gallop();
    }
}
