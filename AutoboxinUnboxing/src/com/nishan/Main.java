package com.nishan;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> intArray = new ArrayList<Integer>();

        int j = 5;
        for (int i=0; i<15; i++)

        {

            intArray.add(Integer.valueOf(j));
            j+=5;
        }

        for (int i=0; i<intArray.size(); i++)

        {
            System.out.println(i +"-->" +intArray.get(i).intValue());
        }

        {
            System.out.println(intArray.get(6).intValue());
        }


    }
}
