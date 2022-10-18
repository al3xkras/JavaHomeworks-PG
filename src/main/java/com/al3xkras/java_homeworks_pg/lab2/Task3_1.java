package com.al3xkras.java_homeworks_pg.lab2;

import java.util.Arrays;

public class Task3_1 {
    public static class Vector{
        private final double[] coordinates;
        Vector(double... coordinates) {
            assert coordinates.length==3;
            this.coordinates = coordinates;
        }
        public void add(Vector v){
            for (int i = 0; i <coordinates.length; i++) {
                coordinates[i]+=v.coordinates[i];
            }
        }
        public void minus(Vector v){
            for (int i = 0; i <coordinates.length; i++) {
                coordinates[i]-=v.coordinates[i];
            }
        }
        public void mult(double c){
            for (int i = 0; i <coordinates.length; i++) {
                coordinates[i]*=c;
            }
        }
        @Override
        public String toString() {
            return "Vector{" +
                    "coordinates=" + Arrays.toString(coordinates) +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vector vector = (Vector) o;
            return Arrays.equals(coordinates, vector.coordinates);
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(coordinates);
        }
    }
}
