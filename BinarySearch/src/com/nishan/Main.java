package com.nishan;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
		// initializing unsorted short array
	Integer arr[] = new Integer[] {5, 2, 15, 52, 10, 18,20, 26};

		// use comparator as null, sorting as natural ordering
	Comparator<Integer> comp = null;

		// sorting array
	Arrays.sort(arr, comp);

    Integer searchValue = 15;  // entering the value to be searched

	int retValue = Arrays.binarySearch(arr,1,4,searchValue,comp);
	System.out.println("The index of element 15 is : " + retValue);

	retValue = Arrays.binarySearch(arr,1,3,searchValue,comp);
	System.out.println("The index of element 15 is : " + retValue);
    }
}
