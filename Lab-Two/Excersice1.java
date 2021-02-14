package com;

import java.util.StringTokenizer; 
public class Excersice1 {
	
	public static void main(String[] args) {
		
		

		
		StringTokenizer st = new StringTokenizer("1 2 3 4 5");
		int sum=0;
		int number;
		while(st.hasMoreTokens()) {
			number =Integer.parseInt(st.nextToken());
			System.out.println(number);
			sum+=number;
		}
	
			System.out.println(sum);
		
		
	}

}
