package com.nishan;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListAddInOrder {

    public static void main(String[] args) {
        LinkedList<String> placeTovisit = new LinkedList<String>();
        addInOrder(placeTovisit, "Aminbazar");
        addInOrder(placeTovisit, "Brahmmonbaria");
        addInOrder(placeTovisit, "Sylhet");
        addInOrder(placeTovisit, "Dhaka");
        addInOrder(placeTovisit, "Chittagong");
        addInOrder(placeTovisit, "Coxbazar");
        addInOrder(placeTovisit, "Sentmartins");

        printLIst(placeTovisit);

        addInOrder(placeTovisit, "Dhaka");
        addInOrder(placeTovisit, "Uttara");
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

    public static boolean addInOrder (LinkedList<String> linkedLists, String addCity)
    {
        ListIterator<String> i = linkedLists.listIterator();
        while (i.hasNext())
        {
            int comparison = i.next().compareTo(addCity);
            if (comparison == 0)
            {
                System.out.println(addCity + " is already in the list.\n");
                return false;
            }

            else if (comparison > 0)
            {
                i.previous();
                i.add(addCity);
                return true;
            }

            else if (comparison < 0)
            {

            }
        }

        i.add(addCity);
        return true;
    }































}
