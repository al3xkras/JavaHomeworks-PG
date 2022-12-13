package com.al3xkras.java_homeworks_pg.lab10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static com.al3xkras.java_homeworks_pg.lab10.Task10_1.*;

public class Task10_2 {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(students);
        Comparator<Student> byFamilyName = Comparator.comparing(Student::familyName);

        Comparator<Student> mixed = Comparator
                .comparing(Student::familyName)
                .thenComparing(Student::firstName)
                .thenComparing(Student::indexNumber);

        System.out.println("before sort: ");
        studentList.forEach(System.out::println);
        studentList.sort(byFamilyName);
        System.out.println();

        System.out.println("after sort (mixed): ");
        studentList.forEach(System.out::println);
        System.out.println();
    }
}
