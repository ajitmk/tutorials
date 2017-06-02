package com.myjava;
import java.util.*;

public class ArraySearchAndSort {

	public static void main(String[] args) {

		int[] myArray1 = {83,200,300,24,500,600,1,800,900};
		int length1 = myArray1.length;
		Arrays.sort(myArray1);
		for (int i =0; i< length1; i++) {
		System.out.println("Array has been sorted: "+ myArray1[i]);
		}
		
		int index = Arrays.binarySearch(myArray1, 24);
		System.out.println("Found 2 @ " + index);
		
	}

}
