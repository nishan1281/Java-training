package com.nishan;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student admit1 = new Student(1,"Nishan");
        Student admit2 = new Student(1,"Nishan");

        System.out.println("admit1 hashcode :" + admit1.hashCode());
        System.out.println("admit2 hashcode :" + admit2.hashCode());
        System.out.println("Check equality : "+ admit1.equals(admit2));


        List<Student> studentsList = new ArrayList<Student>();
        studentsList.add(admit1);
        System.out.println("Arraylist contains Nishan = " + studentsList.contains(new Student(1,"Nishan")));
    }
}
