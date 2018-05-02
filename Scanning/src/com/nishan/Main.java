package com.nishan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        String myString = scanner.next();
        scanner.close();

        System.out.println("your intiger value is " + myInt);
        System.out.println("Your String is " + myString);
    }
}
