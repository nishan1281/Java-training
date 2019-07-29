package com.nishan;

public class Main {

    public static void main(String[] args) {
	reduceByOne(10);
    }
    public static void reduceByOne (int n)
    {
        if (n>0)
        {
            reduceByOne(n-1);
        }
        System.out.println("Completed call " + n);
    }
}
