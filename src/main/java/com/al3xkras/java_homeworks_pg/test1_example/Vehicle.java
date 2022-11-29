package com.al3xkras.java_homeworks_pg.test1_example;

public abstract class Vehicle{
    private final String carType;
    public Vehicle(String carType){
        this.carType=carType;
    }
    public String getCarType() {
        return carType;
    }
    public abstract void drive();

    public static void main(String[]args){
        Vehicle ferrari=new Ferrari();
        Vehicle jeep=new Jeep();
        ferrari.drive();
        jeep.drive();
        Vehicle[]myCars=new Vehicle[2];
        myCars[0]=ferrari;
        myCars[1]=jeep;
        for(Vehicle car:myCars){
            car.drive();
        }
    }
}

