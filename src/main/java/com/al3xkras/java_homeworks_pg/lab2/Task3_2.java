package com.al3xkras.java_homeworks_pg.lab2;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task3_2 {

    public static class GameOfLife{
        private final Universe universe;

        public GameOfLife() {
            /*this.universe = new Universe(new Cell[][]{
                    {new Cell(false),new Cell(false),new Cell(false),new Cell(false)},
                    {new Cell(false),new Cell(true),new Cell(true),new Cell(false)},
                    {new Cell(false),new Cell(true),new Cell(true),new Cell(false)},
                    {new Cell(false),new Cell(false),new Cell(false),new Cell(false)},
            });*/
            this.universe=new Universe(20,20);
        }

        public Universe getUniverse() {
            return universe;
        }

        public void start(int loops){
            for (int i = 0; i < loops; i++) {
                System.out.println("Step "+(i+1));
                for (Cell[] c: universe.getCells()) {
                    System.out.println(Arrays.deepToString(c));
                }
                System.out.println("\n\n");
                universe.nextStep();
            }
        }

        public static void main(String[] args) {
            new GameOfLife().start(100);
        }
    }

    public static class Cell{
        public boolean state;
        public Cell(boolean state) {
            this.state = state;
        }
        public Cell(){
            this.state=false;
        }

        @Override
        public String toString() {
            return state?"O":" ";
        }
    }

    public static class Universe {
        private final Cell[][] cells;

        public Cell[][] getCells() {
            return cells;
        }

        public Universe(int width, int height) {
            this.cells = new Cell[width][height];
            generateInitialState();
        }
        public Universe(){
            this.cells = new Cell[10][10];
            generateInitialState();
        }

        public Universe(Cell[][] cells) {
            this.cells = cells;
        }

        private void generateInitialState(){
            for (int i = 0; i <cells.length; i++) {
                for (int j = 0; j < cells[i].length; j++) {
                    cells[i][j]=new Cell(ThreadLocalRandom.current().nextBoolean());
                }
            }
        }

        public void nextStep(){
            int[][] adjacent = new int[cells.length][cells[0].length];
            for (int i = 0; i < cells.length; i++) {
                for (int j = 0; j < cells[i].length; j++) {
                    int adjacentLiveCells=0;
                    for (int k = Math.max(0,i-1); k <= Math.min(cells.length-1,i+1); k++) {
                        for (int l = Math.max(0,j-1); l <= Math.min(cells[i].length-1,j+1); l++) {
                            if (cells[k][l].state){
                                adjacentLiveCells++;
                            }
                        }
                    }
                    if (cells[i][j].state) adjacentLiveCells--;
                    adjacent[i][j]=adjacentLiveCells;
                }
            }

            for (int i = 0; i < adjacent.length; i++) {
                for (int j = 0; j < adjacent[i].length; j++) {
                    int adjacentLiveCells=adjacent[i][j];
                    if (adjacentLiveCells<2){
                        cells[i][j].state=false;
                    } else if (adjacentLiveCells>3) {
                        cells[i][j].state = false;
                    } else if (adjacentLiveCells==3){
                        cells[i][j].state = true;
                    }
                }
            }
        }

    }
}
