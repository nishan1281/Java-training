package com.nishan;

import java.awt.*;

class Car
{
    private boolean engine;
    private int cylinder;
    private String name;
    private int wheels;

    public Car(int cylinder, String name) {
        this.cylinder = cylinder;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
    }

    public String startEngine()
    {
        return "car ->> startEngine()";
    }

    public String accelarate()
    {return "car-> accelarate()";}

    public String brake()
    {return "car -> brake()";}
}


class Mitshubishi extends Car
        {
            public Mitshubishi (int cylinder, String name)
        {
            super(cylinder, name);
        }

            @Override
            public String startEngine() {
                return "Mitshu ->> startEngine()";
            }

            @Override
            public String accelarate() {
                return "Mitshu ->> accelarate()";
            }

//            @Override
//            public String brake() {
//                return "Mitshu ->> brake()";
//            }
        }



public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car(5,"The base");
        System.out.println(car.startEngine());
        System.out.println(car.accelarate());
        System.out.println(car.brake());

        Mitshubishi mitshubishi = new Mitshubishi(10,"Mitshu125");
        System.out.println(mitshubishi.startEngine());
        System.out.println(mitshubishi.accelarate());
        System.out.println(mitshubishi.brake());            //here is polymorphism observed when brake for mitshubishi was not found.
                                                            // it goes for the base car.


    }
}
