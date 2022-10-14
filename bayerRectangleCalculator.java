/*bayerRectangleCalculator.java
 * Description: Program asks the user for a length and width in pixels, then draws the rectangle, 
 * and outputs the perimeter (in pixels) and area (in pixels squared)
 * created (2021-11-29)
 * Aliya Bayer
 */

package Exercises4;

import java.util.Scanner;

public class bayerRectangleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int length, width, perimeter, area;
		Scanner input = new Scanner(System.in);

		//Input
		System.out.print("Enter length ");  
    	length = input.nextInt(); 
		System.out.print("Enter width ");  
    	width = input.nextInt(); 
    	
    	//Processing
    	perimeter = (length + width) * 2;
    	area = length * width;
    	
    	//Output
    	
    	System.out.print("Perimeter = " + perimeter + ". Area = " + area + ".\n\n");
    	
    	for (int i = 0; i < length; i++) {
    		System.out.print("* ");  
    	}
    	System.out.print("\n");  
    	for (int x = 0; x < width - 2; x++) {
    		System.out.print("* ");  
        	for (int z = 0; z < (length - 2); z++) {
        		System.out.print("  ");  
        	}
        	System.out.print("*\n"); 
    	} 
    	for (int r = 0; r < length; r++) {
    		System.out.print("* ");  
    	}
	}

}
