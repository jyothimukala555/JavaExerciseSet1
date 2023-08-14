package com.javaExSet1;

public class ExamResults{
 
		public static void main(String [] args) {
			
			boolean result1 = isPass(76);

			System.out.println("The total marks is : " + result1 );
			boolean result2 = isPass(45);

			System.out.println("The total marks is : " + result2 );
			// we can call directly in Sysout.
			System.out.println("The total marks is : " + isPass(88) );
			
		}
		public static boolean isPass(int marks) {
			
			if(marks > 50) {
				
				return true;
				
			}
			return false;
			
		}
		
	}


