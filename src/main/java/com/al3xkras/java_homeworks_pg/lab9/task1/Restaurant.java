package com.al3xkras.java_homeworks_pg.lab9.task1;

public class Restaurant {

	public static void main(String[] args) {
		Order cheeseburger = new Hamburger("Cheeseburger", 10);
		cheeseburger = new Extra(cheeseburger,"cheese",2);

		System.out.println(cheeseburger.getDescription() + " " + cheeseburger.getPrice());

		Order o1 = new Hamburger("Ingredients", 100);
		Order o1extra = new Extra(o1,"extra ingredient",50);
		System.out.println(o1extra);
		System.out.println(o1extra.getPrice());
		System.out.println(o1extra.getDescription());
	}

}
