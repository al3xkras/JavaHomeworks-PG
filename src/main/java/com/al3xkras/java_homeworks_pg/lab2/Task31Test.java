package com.al3xkras.java_homeworks_pg.lab2;

import org.junit.jupiter.api.Test;

import static com.al3xkras.java_homeworks_pg.lab2.Task3_1.*;
import static org.junit.jupiter.api.Assertions.*;

class Task31Test {
    @Test
    void testAdd(){
        Vector v1 = new Vector(1,2,3);
        Vector v2 = new Vector(4,5,6);
        v1.add(v2);
        assertEquals(new Vector(5,7,9),v1);
    }

    @Test
    void testMinus(){
        Vector v1 = new Vector(1,2,3);
        Vector v2 = new Vector(0,6,-2);
        v1.minus(v2);
        assertEquals(new Vector(1,-4,5),v1);
        v1.minus(v1);
        assertEquals(new Vector(0,0,0),v1);
    }
}