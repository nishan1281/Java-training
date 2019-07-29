package com.nishan;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> quelist = new LinkedList<>();
        Collections.addAll(quelist,0,1,7,3,4,5);
        quelist.add(6);

        System.out.println(quelist);

        quelist.remove();
        System.out.println(quelist);

        System.out.println(quelist.peek());
        System.out.println(quelist);

        System.out.println(quelist.poll());
        System.out.println(quelist);

    }
}
