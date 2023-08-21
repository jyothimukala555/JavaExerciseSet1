package com.javaExSet1;

public class SumOfSquaresOfFirstNNumbers {
   public static void main (String [] args) {
	   System.out.println(calculateSumOfSquares(5));
   }
 
	
	 public static long calculateSumOfSquares(int n) {
	      
	       if (n<0)
	       {
	           return -1;
	       }
	   long sum = 0;
	   for (int i=1; i<=n; i++){
	    sum += i*i;
	   }
	   /////1,5,14,30,55---o/p=55.
	       return sum;
	    }
}


//OR

//package com.java;
//import java.io.*;

//public class SumOfSquares {
	// Java Program to find sum of
	// square of first n natural numbers
	
	
	 
	    // Return the sum of square of first n natural numbers
	 //   static int squaresum(int n)
	   // {
	        // Iterate i from 1 and n
	        // finding square of i and add to sum.
//	        int sum = 0;
//	        for (int i = 1; i <= n; i++)
//	            sum += (i * i);
//	        return sum;
//	    }
	 ///1,5,14,30
	    // Driven Program
	//    public static void main(String args[]) throws IOException
//	    {
//	        int n = 4;
//	        System.out.println(squaresum(n));
//	    }
//	}


