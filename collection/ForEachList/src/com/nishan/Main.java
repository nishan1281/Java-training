package com.nishan;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();

        students.add("Nishan");
        students.add("mishal");
        students.add("Ariful");


        students.forEach((n) -> System.out.println("Name : "+ n));

    }
}
