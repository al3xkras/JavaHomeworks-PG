package com.al3xkras.java_homeworks_pg.lab1;

public class Task4 {
    public static class Fahrenheit{
        public static void main(String[]args){
            int fahrenheit;
            int celsius;
            int lower=0;
            int upper=300;
            int step=20;

            fahrenheit=lower;
            while(fahrenheit<=upper){
                celsius=5*(fahrenheit-32)/9;
                System.out.println("Temperture: " +fahrenheit+" Fahrenheit= " +celsius+" Celsius ");
                fahrenheit=fahrenheit+step;
            }
            System.out.println("\n\ntask1");
            subtask1();
            System.out.println("\n\ntask2");
            subtask2();
        }
        public static void subtask1(){
            int celsius;
            int lower=0;
            int upper=300;
            int step=20;

            for (int fahrenheit=lower; fahrenheit<=upper; fahrenheit+=step){
                celsius=5*(fahrenheit-32)/9;
                System.out.println("Temperture: " +fahrenheit+" Fahrenheit= " +celsius+" Celsius ");
            }
        }
        public static void subtask2(){
            double celsius;
            double lower=0;
            double upper=300;
            double step=20;

            for (double fahrenheit=lower; fahrenheit<=upper; fahrenheit+=step){
                celsius=5*(fahrenheit-32)/9;
                System.out.println("Temperture: " +fahrenheit+" Fahrenheit= " +celsius+" Celsius ");
            }
        }
    }
}
