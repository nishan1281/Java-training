package com.nishan;

public class Dog extends Animal {

    private int tail;

    public Dog(String name, int weight, int size, int color, int tail)
    {
        super(name, weight, size, color);
        this.tail = tail;

    }

    public void chew()
    {
        System.out.println(getName()+" eat in the way of chew"); // this is a method of dog eating
    }

    @Override            // need to override if eat() method is called it will show the dog method of eat
    public void eat()
    {
        super.eat();    // if we us super it will call the method in supper class animal otherwise will look eat method in the dog class
        chew();
    }

}
