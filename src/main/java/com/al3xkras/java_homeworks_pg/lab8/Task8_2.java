package com.al3xkras.java_homeworks_pg.lab8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static com.al3xkras.java_homeworks_pg.lab8.Task8_1.*;

public class Task8_2 {
    public static void main(String[] args) {
        Comparator<Student> studentComparator = (s1,s2)->{
            int c = s1.getFamilyName().compareTo(s2.getFamilyName());
            if (c!=0)
                return c;
            int c1 = s1.getFirstName().compareTo(s2.getFirstName());
            if (c1!=0)
                return c1;
            return s1.getIndexNumber()-s2.getIndexNumber();
        };

        List<Student> studentList = new ArrayList<>(Arrays.asList(students));

        studentList.add(new Student("a","f",3));
        System.out.println("before sort: "+studentList);
        System.out.println();

        System.out.println("after sort: ");
        studentList.sort(studentComparator);
        studentList.forEach(System.out::println);
        System.out.println();
    }
}
