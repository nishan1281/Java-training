package com.nishan;

public class Emplyer {

    private String name;
    private double salary;
    private String accountNumber;


    public void deposit(double depositAmmount){
        this.salary += depositAmmount;
        System.out.println(depositAmmount + " has been deposited to your account ") ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }
}
