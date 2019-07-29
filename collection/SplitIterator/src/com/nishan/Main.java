package com.nishan;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<String>();
        students.add("Nishan");
        students.add("Mishal");
        students.add("Ariful");
        students.add("Alam");

        // Obtain a Stream to the array list.
        Stream<String> studentStream = students.stream();

        // getting Spliterator object on students
        Spliterator<String> studentsSplit = studentStream.spliterator();

        // estimateSize method
        System.out.println("Estimate size : " + studentsSplit.estimateSize());

        // getExactSizeIfKnown method
        System.out.println("Exact size : " +studentsSplit.getExactSizeIfKnown());

        // hasCharacteristics and characteristics method
        System.out.println(studentsSplit.hasCharacteristics(studentsSplit.characteristics()));

        // forEachRemaining method
        System.out.println("Contents : ");
        studentsSplit.forEachRemaining((n) -> System.out.println(n));

        // Obtaining another  Stream to the array list.
        Stream<String> studentStream2 = students.stream();
        studentsSplit = studentStream2.spliterator();

        // trySplit() method
        Spliterator<String> studentsSplit2 = studentsSplit.trySplit();

        // If splitr1 could be split, use splitr2 first.
        if (studentsSplit2 != null)
        {
            System.out.println("output from studentsSplit2 : ");
            studentsSplit2.forEachRemaining((n) -> System.out.println(n));
        }

        //now use the studentsSplit
        System.out.println("\n Output from studentsSplit");
        studentsSplit.forEachRemaining((n) -> System.out.println(n));
    }
}
