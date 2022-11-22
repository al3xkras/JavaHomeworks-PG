package com.al3xkras.java_homeworks_pg.lab7;

import java.util.Objects;

public class Ship implements Comparable<Ship> {
	private int  length;

	public Ship(int length) {
		this.length = length;
	}

	@Override
	public int compareTo(Ship other) {
		return this.length - other.length;
	}

	@Override
	public String toString() {
		return "Ship [length=" + length + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Ship ship = (Ship) o;
		return length == ship.length;
	}

	@Override
	public int hashCode() {
		return Objects.hash(length);
	}
}
