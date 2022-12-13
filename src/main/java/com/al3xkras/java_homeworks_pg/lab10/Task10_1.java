package com.al3xkras.java_homeworks_pg.lab10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task10_1 {
    public record Student(String firstName, String familyName, Integer indexNumber) {
        @Override
        public String toString() {
            return "Student{" +
                    "firstName='" + firstName + '\'' +
                    ", familyName='" + familyName + '\'' +
                    ", indexNumber=" + indexNumber + '}';
        }
    }

    static Student[] students = new Student[]{
            new Student("a","l",1),
            new Student("b","c",10),
            new Student("c","b",13),
            new Student("a","f",7),
            new Student("v","e",2),
            new Student("e","f",5),
            new Student("m","a",3)
    };

    private static final class StudentDemo{
        public static void main(String[] args) {
            List<Student> studentList = Arrays.asList(students);
            List<Student> studentList1 = Arrays.asList(students);
            Comparator<Student> byFamilyName = Comparator.comparing(Student::familyName);

            Comparator<Student> byIndex = Comparator.comparing(Student::indexNumber);

            System.out.println("before sort: "+studentList);
            studentList.sort(byFamilyName);
            System.out.println();

            System.out.println("after sort (by familyName): ");
            studentList.forEach(System.out::println);
            System.out.println();

            studentList1.sort(byIndex);
            System.out.println("after sort (natural order: by index): ");
            studentList1.forEach(System.out::println);

            studentList1.sort(byIndex.reversed());
            System.out.println("after sort (reverse order: by index): ");
            studentList1.forEach(System.out::println);
        }
    }
}
