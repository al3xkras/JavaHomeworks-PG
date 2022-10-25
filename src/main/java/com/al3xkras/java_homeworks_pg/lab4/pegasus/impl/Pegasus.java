package com.al3xkras.java_homeworks_pg.lab4.pegasus.impl;

import com.al3xkras.java_homeworks_pg.lab4.pegasus.BirdInterface;
import com.al3xkras.java_homeworks_pg.lab4.pegasus.impl.Horse;

public class Pegasus extends Horse implements BirdInterface {
    public Pegasus(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I am flying. I am flying.");
    }
}
