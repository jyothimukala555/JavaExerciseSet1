package com.javaExSet1;

public class PerfectNumber {

	public static void main(String[] args) {
		// PerfectNumber = sum of factors of that number = number;
                     //      1+2+4+7+14                  = 28;
//		A number whose sum of factors (excluding the number itself) 
//		is equal to the number is called a perfect number.

		PerfectNumber pm = new PerfectNumber();
		System.out.println(pm.isPerfectNumber(5));
		System.out.println(pm.isPerfectNumber(256));
		System.out.println(pm.isPerfectNumber(16));
		System.out.println(pm.isPerfectNumber(28));

	}
	  public boolean isPerfectNumber(int number) {
	        if (number <=0){
	        return false;
	        }
	        int sum=0;
	        
	        for(int i=1;i<number;i++)
	        {
	            if(number%i==0)
	            sum +=i;
	        }
	        
	        return sum==number;
	    }
}
