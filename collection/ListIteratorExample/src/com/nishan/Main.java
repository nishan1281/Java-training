package com.nishan;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> user = new ArrayList<String>();
        user.add("nishan");
        user.add("Mishal");
        user.add("Arif");
        user.add(1, "Dihan");
        user.add(2,"Nupur");

        System.out.println(user);

        System.out.println("Forwarding");
        ListIterator itr = user.listIterator();
        while (itr.hasNext())
        {
            System.out.println("Index " + itr.nextIndex() + ": " + itr.next());
        }

        System.out.println("Reversing");
        while (itr.hasPrevious())
        {
            System.out.println("Index " + itr.previousIndex() + ": " +itr.previous());
        }

        System.out.println(user.size());
    }
}
