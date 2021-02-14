package com;
import java.lang.*;



public class Exercise2 {
	
	
	private static String getImage(String name) {
		String n = name;
		StringBuffer s = new StringBuffer(name);
		return n+"|" + s.reverse();
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	System.out.println(getImage("EARTH"));
		}

}
