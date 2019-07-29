package com.nishan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import java.util.Spliterator;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        Stream<String> studentsStream = students.stream();
        Collections.addAll(students, "Nishan", "Mishal", "Ariful");

        ArrayList<String> college = new ArrayList<>();
        studentsStream.forEachOrdered(college::add);

        //adding without stream apply
        ArrayList<String> family = new ArrayList<>();
        Optional.ofNullable(students).ifPresent(family::addAll);
        System.out.println(family);


        Stream<String> collegeStream = college.stream();
        Spliterator<String> collegeSplit = collegeStream.spliterator();
        collegeSplit.forEachRemaining((n)-> System.out.println(n));


        ArrayList<String> business = new ArrayList<String>();
        Collections.addAll(business,"alif", "batasa");
        System.out.println(business);

        students.addAll(1,business);
        System.out.println(students);

        students.remove(0);
        System.out.println(students);

        System.out.println(students.get(3));

        System.out.println(students.size());

        students.set(3,"Nishan");
        System.out.println(students);


    }
}
