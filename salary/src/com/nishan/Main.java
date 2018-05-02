package com.nishan;

public class Main {

    public static void main(String[] args) {

        Emplyer nishan = new Emplyer();
        nishan.setName("Md. Ariful Alam Nishan");
        System.out.println(nishan.getName());
        nishan.setAccountNumber("1234");
        System.out.println(nishan.getAccountNumber());

        nishan.deposit(100);
    }
}
