package com.al3xkras.java_homeworks_pg.lab6;

public class Task6_3 {
    private static class Course {
        private String name;
        private String room;

        private static volatile Course instance;

        private Course() { }

        public static Course getInstance() {
            if (instance == null) {
                synchronized (Course.class){
                    if (instance == null) {
                        instance = new Course();
                    }
                }
            }
            return instance;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRoom() {
            return room;
        }

        public void setRoom(String room) {
            this.room = room;
        }
    }

    private static class Professor {
        public static void main(String[] args) {
            Course myCourse = Course.getInstance();
            myCourse.setName("OJP3");
            myCourse.setRoom("202");
            Student[] myStudents = new Student[4];
            for (int i = 0; i < myStudents.length; i++) {
                myStudents[i] = new Student();
            }
            System.out.println("All students are working very hard ...");
            for (Student a: myStudents) {
                a.study();
            }
        }
    }

    private static class Student {
        public void study() {
            System.out.print("I go to room " + Course.getInstance().getRoom() + ". ");
            System.out.println("I study " + Course.getInstance().getName() + ". ");
        }
    }
}
