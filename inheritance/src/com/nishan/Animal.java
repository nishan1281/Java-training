package com.nishan;

public class Animal {

    private String name;
    private int weight;
    private int size;
    private int color;

    public Animal(String name, int weight, int size, int color)
    {
        this.name = name;
        this.weight = weight;
        this.size = size;
        this.color = color;
    }


    public void eat()
    {
        System.out.println(this.name + " can eat");  // it is a general eating method for all animal
    }


    public String getName()
    {
        return name;
    }

    public int getWeight()
    {
        return weight;
    }

    public int getSize()
    {
        return size;
    }

    public int getColor()
    {
        return color;
    }
}
