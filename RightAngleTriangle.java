package com.javaExSet1;

public class RightAngleTriangle {
//Right Angle triangle = Sum of squares of 2 sides = square of third side;
	// AC^2=AB^2+BC^2;
	public static void main(String[] args) {
		RightAngleTriangle rat = new RightAngleTriangle();
		rat.isRightAngled(2,3,5);
		System.out.println(rat.isRightAngled(3,4,5));
		System.out.println(rat.isRightAngled(12,16,25));
		
	}
	   public boolean isRightAngled(int side1, int side2, int side3) {
	        // write your code
	        if (side1<=0 || side2<=0 || side3<=0){
	            return false;
	        }
	      if(side1 *side1 == side2*side2 + side3 *side3){
	          return true;
	      }
	        if(side2 *side2 == side1*side1 + side3 *side3){
	          return true;
	      }
	        if(side3 *side3 == side2*side2 + side1 *side1){
	          return true;
	      }
	      
	       return false; 
	    }
	    
}
