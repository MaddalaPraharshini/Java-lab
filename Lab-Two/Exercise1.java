package com;

import java.util.Arrays;
import java.util.Scanner;
 

public class Exercise1 {
	
	public static int getSecondSmallest(int[] numbArray) {
		Arrays.sort(numbArray);
		int secondHighest = numbArray.length-2;
 
		return numbArray[secondHighest];
		 
		
	}
	
	public static void main(String[] args) {
		
	int[] a = {1,2,5,8,2,1};
	 
		System.out.println("The second largest number is "+getSecondSmallest(a));
		
		
	}

}
