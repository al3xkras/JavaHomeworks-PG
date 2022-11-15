package com.al3xkras.java_homeworks_pg.lab6;

import java.time.LocalDate;

import static com.al3xkras.java_homeworks_pg.lab6.Task6_1.Student;

public class Task6_2 {
    public static void main(String[] args) {
        new StudentDemo().testStudentBuilder();
    }
    private static class StudentDemo{
        void testStudentBuilder(){
            Student s1 = StudentBuilder.builder()
                    .studentNumber(1)
                    .name("Mark")
                    .birthdayDate(LocalDate.of(2001,10,11))
                    .build();
            Student s2 = StudentBuilder.builder().studentNumber(2)
                    .name("Andrew")
                    .birthdayDate(LocalDate.of(2001,7,5))
                    .build();

            Student s11 = new Student(1,"Mark",LocalDate.of(2001,10,11));
            Student s21 = new Student(2,"Andrew",LocalDate.of(2001,7,5));

            assert s1.equals(s11);
            assert s2.equals(s21);
        }
    }
    public static final class StudentBuilder{
        private long studentNumber;
        private String name;
        private LocalDate birthdayDate;
        private StudentBuilder(){}
        public static StudentBuilder builder(){
            return new StudentBuilder();
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

        public StudentBuilder name(String name){
            this.name=name;
            return this;
        }
        public StudentBuilder birthdayDate(LocalDate birthdayDate){
            this.birthdayDate=birthdayDate;
            return this;
        }
        public StudentBuilder studentNumber(long studentNumber){
            this.studentNumber=studentNumber;
            return this;
        }
        public Student build(){
            return new Student(studentNumber,name,birthdayDate);
        }
    }
}
