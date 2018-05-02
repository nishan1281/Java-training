package com.nishan;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(2,5,6);
	    Case theCase = new Case("2200","Dell", "240V", dimensions);
        Monitor monitor = new Monitor("256", "Dell", 20, new Resolution(9,23));
        Motherboard motherboard = new Motherboard("254","Dell", 4, 5, "V02");

        PC thePC = new PC(theCase, monitor, motherboard);
        thePC.powerUp();
        System.out.println(thePC.monitorResultionWidth()); //using encapsulation

//        thePC.getMonitor().drawPixelAt(1,2,"red");
//        thePC.getMotherboard().programLoad("news");
//        thePC.getThecase().pressPowerButton();




    }
}
