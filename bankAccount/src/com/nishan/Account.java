package com.nishan;

public class Account
{
    private String name;
    private String email;
    private int mobileNumber;
    private String number;
    private double balance;

    public Account(String name, String email, int mobileNumber, String number, double balance)
    {
        this.name = name;
        this.balance = balance;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.number = number;

    }
    public Account()
    {
int _upwork;
    }

    public String getName()
    {
        return name;
    }

    public void setName()
    {
        this.name = name;
    }



    public void deposit(double depositAmmount){
        this.balance += depositAmmount;
        System.out.println(depositAmmount + " has been deposited to your account " + this.name);
        System.out.println("Your current balance after deposit " + this.balance );
    }

    public void withdraw (double withdrawAmmount)
    {
        if (this.balance-withdrawAmmount <= 0)
        {
            System.out.println("your withdraw not possible");
        }
        else {
            System.out.println("your withdraw was successful");
            this.balance -= withdrawAmmount;
            System.out.println("your current balance is " + this.balance);
        }

    }

}

