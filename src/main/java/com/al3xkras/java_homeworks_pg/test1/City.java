package com.al3xkras.java_homeworks_pg.test1;

public class City implements Comparable<City>{
    private String name;

    public City(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    @Override
    public int compareTo(City city) {
        return this.name.compareTo(city.name);
    }

    @Override
    public String toString(){
        return "City( "+name+" )";
    }
}
