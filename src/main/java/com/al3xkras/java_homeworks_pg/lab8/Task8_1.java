package com.al3xkras.java_homeworks_pg.lab8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task8_1 {

    public static class Student{
        private final String firstName;
        private final String familyName;
        private final Integer indexNumber;
        public Student(String firstName, String familyName, Integer indexNumber) {
            this.firstName = firstName;
            this.familyName = familyName;
            this.indexNumber = indexNumber;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "firstName='" + firstName + '\'' +
                    ", familyName='" + familyName + '\'' +
                    ", indexNumber=" + indexNumber +
                    '}';
        }

        public String getFirstName() {
            return firstName;
        }

        public String getFamilyName() {
            return familyName;
        }

        public Integer getIndexNumber() {
            return indexNumber;
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

    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(students);
        List<Student> studentList1 = Arrays.asList(students);
        Comparator<Student> studentComparator = Comparator
                .comparing(Student::getFamilyName);

        Comparator<Student> reverse = (student, student1)->
                -student.familyName.compareTo(student1.familyName);

        System.out.println("before sort: "+studentList);
        studentList.sort(studentComparator);
        System.out.println();

        System.out.println("after sort (natural order: Comparator.comparing Student::familyName): ");
        studentList.forEach(System.out::println);
        System.out.println();

        studentList1.sort(reverse);
        System.out.println("after sort (reverse order): "+studentList1);
        studentList1.forEach(System.out::println);

    }

}
