package com.javaExSet1;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isLeapYear(2000));
		System.out.println(isLeapYear(1998));
		System.out.println(isLeapYear(1994));
		System.out.println(isLeapYear(2012));

	}
	 public static boolean isLeapYear(int year) {
	       
	       if (year<1){
	       return false;
	           
	       }
	       if (year%4!=0){
	        
	       return false;
	           
	       }
	       if(year%100!=0){
	       return true;
	       }
	       if(year %400!=0){
	       return false;
	       }
	       
	       return true;
	    }

}
