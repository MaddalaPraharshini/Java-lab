package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise3 {

	private static final String CONSONANTS = "bcdfghjklmnpqrstvwxyz";
	

	private static String altrString(String input) {
		char[] chars = input.toLowerCase().toCharArray();
	    for (int i = 0; i < chars.length; i++) {
	        int idx = CONSONANTS.indexOf(chars[i]);
	        if (idx != -1)
	            chars[i] = CONSONANTS.charAt((idx + 1) % CONSONANTS.length());
	    }
	    return new String(chars);

	}
	

	public static void main(String[] args) {
		System.out.println(altrString("java"));

	
		
	}
}