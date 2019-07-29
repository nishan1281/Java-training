package com.nishan;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	Student admit1 = new Student(1,"Nishan");
	Student admit2 = new Student(1,"Nishn");

        HashSet<Student> students = new HashSet<Student>();
        students.add(admit1);
        System.out.println("HashSet contains admit1 = " + students.contains(new Student(1, "Nishan")));

        //here although contains is used instead of equal. Equal will not give good result.

    }
}


