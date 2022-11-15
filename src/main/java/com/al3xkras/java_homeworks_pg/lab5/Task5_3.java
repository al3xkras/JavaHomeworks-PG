package com.al3xkras.java_homeworks_pg.lab5;

import java.util.HashMap;
import java.util.Objects;

public class Task5_3 {
    public static void main(String[] args) {
        HashMap<Student, Double> studentMarks = new HashMap<>();

        Student student1 = new Student("Michael","Jackson",0);
        Student student2 = new Student("Freddy","Mercury",1);
        Student student3 = new Student("John","Lennon",2);
        Student student4 = new Student("Chris","Rea",3);

        studentMarks.put(student1, 4.5);
        studentMarks.put(student2, 4.0);
        studentMarks.put(student3, 5.0);
        studentMarks.put(student4, 4.0);

        Student bestStudent = studentMarks.entrySet().stream()
                .reduce((e1,e2)->e1.getValue()>e2.getValue()?e1:e2)
                .get().getKey();

        System.out.println(bestStudent);

    }

    static class Student{
        private final String surname;
        private final String firstName;
        private final long index;
        public Student(String surname, String firstName, long index) {
            this.surname = surname;
            this.firstName = firstName;
            this.index = index;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return index == student.index && surname.equals(student.surname) && firstName.equals(student.firstName);
        }
        @Override
        public int hashCode() {
            return Objects.hash(surname, firstName, index);
        }
        @Override
        public String toString() {
            return "Student( " + surname +
                    " " + firstName + " )";
        }
    }
}
