package com.al3xkras.java_homeworks_pg.lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatDemo {
	public static void main(String[] args) {
		List<Cat> myCats = new ArrayList<>();
		Cat kitty = new Cat("Kitty");
		Cat tiger = new Cat("Tiger");
		Cat tom = new Cat("Tom");
		myCats.add(kitty);
		myCats.add(tom);
		myCats.add(tiger);
		Collections.sort(myCats);
		System.out.println(myCats);
	}
}
