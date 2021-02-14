package com;

//TODO Auto-generated method stub
import java.util.*;
import java.io.*;

public class Exercise5 {
 
	      static int wordcount(String string)  
	        {  
	          int count=0;  
	      
	            char ch[]= new char[string.length()];     
	            for(int i=0;i<string.length();i++)  
	            {  
	                ch[i]= string.charAt(i);  
	                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
	                    count++;  
	            }  
	            return count;  
	        }  
	      
	      public static void main(String[] args) { 
	    	  int count=0;
	          String string ="    Praharshini is a good girl";  
	         System.out.println(wordcount(string) + " words.");  

	    	  for(int i = 0; i < string.length(); i++) {    
	              if(string.charAt(i) != ' ')    
	                  count++;    
	          }    
	    	  System.out.println("Total number of characters in a string: " + count);
	    }  

	}