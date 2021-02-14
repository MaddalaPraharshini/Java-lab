package com;

import java.util.Scanner;

import javax.swing.SortingFocusTraversalPolicy;

/*
Exercise 2: Create a method that can accept an array of String objects andsort in alphabetical
order. The elements in the left half should be completely in uppercase and the elements in the
right half should be completely in lower case. Return the resulting array.
Note: If there are odd number of String objects, then (n/2) +1 elements should be in
UPPPERCASE
*/

public class Exercise2 {
	
	public static String sortStrings(String inString) {
		int inputLength;
		if(inString.length()%2==0)
		{
			inputLength = inString.length()/2;
		}
		else {
			inputLength = (inString.length()/2)+1;
		}
		String left = inString.substring(0, inputLength).toUpperCase();
		String right = inString.substring(inputLength,inString.length());
		return left+right;
	}

	public static void main(String[] args) {
		System.out.println("Enter String : ");
		Scanner s = new Scanner(System.in);
		String inString = s.next();
		
		System.out.println(sortStrings(inString));
		
		
		
	}
	

}
