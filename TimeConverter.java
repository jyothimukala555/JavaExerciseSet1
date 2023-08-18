package com.javaExSet1;

public class TimeConverter {


	public static void main(String[] args) {
      System.out.println(convertHoursToMinutes(5));
      System.out.println(convertDaysToMinutes(4));
	
	}
	

  public static int convertHoursToMinutes(int hours){
	  if (hours<0) {
		  return -1;
	  }
	  int noOfMinutes = hours *60;
	  return noOfMinutes;
  }
  
  public static int convertDaysToMinutes(int days){
	  if (days<0) {
		  return -1;
	  }
	  int noOfMinutes = days *24*60;
	  return noOfMinutes;

  }
}

