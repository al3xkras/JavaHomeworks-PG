package com.al3xkras.java_homeworks_pg.lab7;

import java.util.*;

public class ShipDemo {
	public static void main(String[] args) {

		Ship s4 = new Ship(75);
		Ship s5 = new Ship(125);
		Ship s6 = new Ship(310);
		Ship s1 = new Ship(15);
		Ship s3 = new Ship(45);
		Ship s2 = new Ship(30);

		List<Ship> ships = new ArrayList<>(Arrays.asList(
				s4,s5,s6,s1,s3,s2
		));

		System.out.println("Ships before sort: "+ships);
		System.out.println();
		for (Ship sh1 : ships) {
			for (Ship sh2 : ships){
				System.out.println(sh1+" compared to "+sh2+" results: "+sh1.compareTo(sh2));
			}
		}
		ships.sort(Comparator.naturalOrder());
		System.out.println();
		System.out.println("Ships after sort: "+ships);
	}
}
