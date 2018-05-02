package com.nishan;

public class Main {

    public static void main(String[] args)
    {
      Car porsche = new Car();
      Car ferrari = new Car();
      Car lemousin = new Car();

      porsche.setModel("nishan");
        System.out.println("The model of car is " + porsche.getModel());

      ferrari.setModel("fr02");
        System.out.println("The model of car is " + ferrari.getModel());

      lemousin.setModel("lmsn02");
        System.out.println("The model of car is " + lemousin.getModel());

    }
}
