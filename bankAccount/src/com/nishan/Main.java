package com.nishan;


public class Main {

    public static void main(String[] args) {

        Account nishan = new Account("nishan", "nishan@gmail.com", 0233, "a325ad", 10000);

        nishan.deposit(1000);
        nishan.withdraw(50000);

        System.out.println(nishan.getName());



    }
}
