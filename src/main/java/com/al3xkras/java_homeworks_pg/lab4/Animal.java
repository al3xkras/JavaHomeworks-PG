package com.al3xkras.java_homeworks_pg.lab4;

public abstract class Animal {
  private String species;

  public Animal(String species){
    this.species=species;
  }
  public abstract void makeNoise();

  public static class Cat extends Animal{
    public Cat() {
      super("cat");
    }
    @Override
    public void makeNoise() {
      System.out.println("Miau Miau");
    }
  }

  public static class Mouse extends Animal{
    public Mouse() {
      super("mouse");
    }
    @Override
    public void makeNoise() {
      System.out.println("Fiep Fiep");
    }
  }
}