package com.nishan;

public class Car extends Vehicle {

   private int doors;
   private int wheels;
   private int geers;
   private boolean isManual;

   private int currentGeers;

    public Car(String name, String size, int doors, int wheels, int geers, boolean isManual)
    {
        super(name,size);

        this.doors = doors;
        this.wheels = wheels;
        this.geers = geers;
        this.isManual = isManual;
        this.currentGeers = 1;
    }

    public Car(int doors)
    {
        this.doors = doors;
    }

    public void changeGeers(int currentGeers)
    {
        this.currentGeers = currentGeers;
        System.out.println("car changed to " + this.currentGeers + " geers.");
    }

    public void changeVelocity (int speed, int direction)
    {
        move(speed, direction);

        System.out.println("car changed velocity " + speed + " direction " + direction);
    }





}
