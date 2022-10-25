package com.al3xkras.java_homeworks_pg.lab4.pegasus.impl;

import com.al3xkras.java_homeworks_pg.lab4.pegasus.Animal;

public class Horse extends Animal {

	public Horse(String name) {
		super(name);
	}
	
	public void gallop() {
		System.out.println("I am galloping!");
	}

	@Override
	public void eat() {
		System.out.println("Mumph, mumph. A horse is eating.");
	}
}
