package com.nishan;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> placeTovisit = new LinkedList<String>();
        placeTovisit.add("Dhaka");
        placeTovisit.add("Sylhet");
        placeTovisit.add("Rajshahi");
        placeTovisit.add("Feni");
        placeTovisit.add("Chitagong");
        placeTovisit.add("Borishal");
        placeTovisit.add("Konojaigaina");

        printLIst(placeTovisit);
        placeTovisit.remove(6);

        placeTovisit.add(1,"Airport");
        printLIst(placeTovisit);


    }

    public static void printLIst(LinkedList<String> linkedList)
    {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext())
        {
            System.out.println("You are visiting " + i.next());
        }
        System.out.println("====================================");
    }


}
