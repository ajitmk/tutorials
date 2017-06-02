package com.myjava;
import java.util.*;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		int[] myIntArray1 = {100,90,80,70,60,50,40};
		//int[] myIntArray1;
		//myIntArray1 = new int[10];
		//myIntArray1[0] =100;
		//myIntArray1[1] =200;
		
		
		System.out.println("0 index:" + myIntArray1[0]);
		System.out.println("1st index:" + myIntArray1[1]);
		System.out.println("2nd index:" + myIntArray1[2]);
		
		String[] myStringArray1 = {"bmw","audi","honda"};
		System.out.println("0 index:" + myStringArray1[0]);
		System.out.println("1st index:" + myStringArray1[1]);
		System.out.println("2nd index:" + myStringArray1[2]);
		
		int length1 = myIntArray1.length;
		int length2 = myStringArray1.length;
		System.out.println("Int array lenth is "+ length1);
		System.out.println("String array lenth is "+ length2);
		
		for (int i=0; i < length1; i++ )
			System.out.println("Array loop sequence: "+ myIntArray1[i]);
		
	
		Arrays.sort(myIntArray1);
		
		for (int i=0; i < length1; i++ )
			System.out.println("Array loop sequence sorted : " + myIntArray1[i]);
			
	}

}
