package com.al3xkras.java_homeworks_pg.lab4.pegasus.impl;

import com.al3xkras.java_homeworks_pg.lab4.pegasus.Animal;
import com.al3xkras.java_homeworks_pg.lab4.pegasus.BirdInterface;

public class Bird extends Animal implements BirdInterface {

	public Bird(String name) {
		super(name);
	}

	@Override
	public void fly() {
		System.out.println("I am flying. I am flying.");
	}

	@Override
	public void eat() {
		System.out.println("Pick pick - a bird is eating.");
	}
}
