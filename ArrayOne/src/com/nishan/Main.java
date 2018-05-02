package com.nishan;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int[] tryintegers = {1,2,3,4,5,8,7};

        int [] myInteger = getIngers(4);
        printArray(myInteger);
        System.out.println("\n Integer no. 2 is : " + myInteger[2]);

        System.out.println("\n After sorting the myinteger is : ");
        int[] sorted = sortArray(myInteger);
        printArray(sorted);


     }

     public static int[] getIngers(int range)
     {
        int[] array = new int[range];
         System.out.println("Enter "+ range + " integer value : ");
         for (int i =0; i<array.length; i++)
         {
             array[i] = scan.nextInt();
         }
         return array;
     }

     public static void printArray(int[] array)
     {
         for (int i =0; i< array.length; i++)
         {
             System.out.println("Array no " + i + " is : " + array[i]);
         }
     }

     public static int[] sortArray(int[] array)
     {
         int[] sortedArray = Arrays.copyOf(array, array.length);
         boolean flag = true;
         int temp;

         while (flag) {
             flag = false;

             for (int i = 0; i < sortedArray.length - 1; i++) {
                 if (sortedArray[i] < sortedArray[i + 1]) {

                     temp = sortedArray[i];
                     sortedArray[i] = sortedArray[i+1];
                     sortedArray[i+1] = temp;
                     flag = true;
                 }
             }

         }

         return sortedArray;
     }





    }
