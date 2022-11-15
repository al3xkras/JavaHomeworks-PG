package com.al3xkras.java_homeworks_pg.lab6;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Task6_1 {

    public static void main(String[] args) {
        new StudentDemo().testStudent();
    }

    public static class StudentDemo{
        public void testStudent(){
            Student s1 = new Student(1,"Mark",LocalDate.of(2001,10,11));
            Student s2 = new Student(2,"Andrew",LocalDate.of(2001,7,5));

            assert s1.getStudentNumber()==1 &&
                    s1.getName().equals("Mark") &&
                    s1.getBirthdayDate().equals(LocalDate.of(2001,10,11));

            assert s2.getStudentNumber()==2 &&
                    s2.getName().equals("Andrew") &&
                    s2.getBirthdayDate().equals(LocalDate.of(2001,7,5));
        }
    }

    public static final class Student {
        private final long studentNumber;
        private final String name;
        private final LocalDate birthdayDate;

        public Student(long studentNumber, String name, LocalDate birthdayDate) {
            this.studentNumber = studentNumber;
            this.name = name;
            this.birthdayDate = birthdayDate;
        }

        public long getStudentNumber() {
            return studentNumber;
        }

        public String getName() {
            return name;
        }

        public LocalDate getBirthdayDate() {
            return birthdayDate;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "studentNumber=" + studentNumber +
                    ", name='" + name + '\'' +
                    ", birthdayDate=" + birthdayDate +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return studentNumber == student.studentNumber && Objects.equals(name, student.name) && Objects.equals(birthdayDate, student.birthdayDate);
        }

        @Override
        public int hashCode() {
            return Objects.hash(studentNumber, name, birthdayDate);
        }
    }
}
