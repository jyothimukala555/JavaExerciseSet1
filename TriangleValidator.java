package com.javaExSet1;

public class TriangleValidator {
 // sum of angles of a triangle is equal to 180;
	// angle = angle1+ angle2 + angle3==180;
	
	
	public static void main(String[] args) {
		System.out.println(isValidTriangle(3,4,5));
	}
	public static boolean isValidTriangle(int angle1, int angle2, int angle3) {
       
        if(angle1 <= 0|| angle2 <=0 || angle3 <=0)
        return false;
       int angle = angle1+angle2+angle3;
 
        return angle==180;
      
    }
}
