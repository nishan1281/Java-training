package com.nishan;

public class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size)
    {
        this.name = name;
        this.size = size;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public Vehicle()
    {
        //this blank method is declared due to inheritance overloading in Car class.
    }

    public void steer (int direction)
    {
        this.currentDirection += direction;
        System.out.println("Vehicle steering at " + currentDirection + " degrees");
    }

    public void move(int velocity, int direction)
    {
        currentDirection = direction;
        currentVelocity = velocity;
        System.out.println("Vehicle move(); moving at " + currentVelocity + ", in direction " + currentDirection);
    }

    public void stop()
    {
        this.currentVelocity = 0;
    }


    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
