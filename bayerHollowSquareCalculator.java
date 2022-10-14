/*bayerHollowSquareCalculator.java
 * Description: Program asks the user for a radius in pixels, then uses the given radius to draw an 
 * image with a square and a circle like the one on the right, and then calculates and outputs the 
 * area of the shaded portion rounded to the nearest square pixel. 
 * created (2021-11-29)
 * Aliya Bayer
 */
package Exercises4;
import java.text.DecimalFormat;
import java.util.Scanner;

public class bayerHollowSquareCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		double radius, area;
		Scanner input = new Scanner(System.in);
		DecimalFormat numform = new DecimalFormat("0");
		//Input
    	System.out.print("HOLLOW SQUARE CALCULATOR!!!\n");
		System.out.print("Enter the radius ");  
    	radius = input.nextFloat(); 
    	//Processing
    	area = (radius * 2) * (radius * 2) - (Math.PI * radius * radius);
    	
    	//Output
    	System.out.print("The area of a shaded portion is " + numform.format(area)); 
    	
	}

}
