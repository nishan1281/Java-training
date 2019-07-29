package com.nishan;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<String> pQueue = new PriorityQueue<String>();
        Collections.addAll(pQueue,"D", "C", "j", "b");

        System.out.println(pQueue);
        pQueue.poll();
        System.out.println(pQueue);


    }
}
