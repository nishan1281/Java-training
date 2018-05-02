package com.nishan;

public class VipCustomer {
    private double creditLimit;
    private String name;
    private String emailAdress;

    public VipCustomer()
    {
        this (10000.0, "Nishan", "nishanbsc@email.com");
        System.out.println( this.name + ": This is for default " + this.creditLimit);
    }

    public VipCustomer(String emailAdress) {
        this(10000.0, "Nishan", emailAdress);
        System.out.println(this.name + ": This is with two default value");
    }

    public VipCustomer(double creditLimit, String name, String emailAdress)
    {
        this.creditLimit = creditLimit;
        this.name = name;
        this.emailAdress = emailAdress;
        System.out.println(this.name + ": This all three field" + this.creditLimit);
    }





    public double getCreditLimit() {
        return creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}
