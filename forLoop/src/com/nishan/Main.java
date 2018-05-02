package com.nishan;

public class Main {

    public static void main(String[] args)
    {
        for (int i =8; i>1; i--)
        {
            System.out.println("10,000 at " + i +"% intetest rate = " + String.format(("%.2f"),calculateInterest(10000,i)));
        }
    }

    public static double calculateInterest(double ammount, double interest)
    {
        return (ammount*(interest/100));
    }
}
