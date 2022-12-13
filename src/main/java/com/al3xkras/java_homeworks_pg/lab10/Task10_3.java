package com.al3xkras.java_homeworks_pg.lab10;

public class Task10_3 {
    public interface Camera{
        default void makePicture(){
            System.out.println("taking picture");
        }
        default void chargeBattery(){
            System.out.println("charging camera");
        }
    }
    public interface Phone{
        default void dialNumber(){
            System.out.println("dialing number");
        }
        default void chargeBattery(){
            System.out.println("charging phone");
        }
    }
    public static class SmartPhone implements Camera,Phone{
        @Override
        public void chargeBattery() {
            Phone.super.chargeBattery();
        }
    }
    public static void main(String[] args) {
        new SmartPhone().chargeBattery();
    }
}
