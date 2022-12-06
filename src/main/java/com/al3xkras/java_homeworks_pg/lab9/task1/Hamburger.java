package com.al3xkras.java_homeworks_pg.lab9.task1;

public class Hamburger implements Order {

	private String description;
	private double price;
	
	public Hamburger(String description, double price) {
		this.description = description;
		this.price = price;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Hamburger{" +
				"description='" + description + '\'' +
				", price=" + price +
				'}';
	}
}
