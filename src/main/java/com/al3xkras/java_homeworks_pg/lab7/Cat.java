package com.al3xkras.java_homeworks_pg.lab7;

import java.util.Objects;

public class Cat implements Comparable<Cat> {
	private final String name;

	public Cat(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Cat other) {
		return name.compareTo(other.name);
	}

	@Override
	public String toString() {
		return "Cat( "+name+" )";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Cat cat = (Cat) o;
		return Objects.equals(name, cat.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
