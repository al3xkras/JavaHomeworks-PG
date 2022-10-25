package com.al3xkras.java_homeworks_pg.lab4;

public class Task4_1 {
    public static void main(String[]args){
        Animal cat=new Animal.Cat();
        Animal mouse=new Animal.Mouse();
        cat.makeNoise();
        mouse.makeNoise();
        Animal[]myPets=new Animal[2];
        myPets[0]=cat;
        myPets[1]=mouse;
        for(Animal pet:myPets){
            pet.makeNoise();
        }
    }
}
