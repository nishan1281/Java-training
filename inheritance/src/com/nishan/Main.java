package com.nishan;

public class Main {

    public static void main(String[] args) {

    Dog britain = new Dog("tomy",1,2,3,4);
    britain.eat();    // it will show chew method because chew is override in the eat() method

    Dog bangladesh = new Dog("kutta", 1,2,3,4);
    bangladesh.eat();

    }
}
