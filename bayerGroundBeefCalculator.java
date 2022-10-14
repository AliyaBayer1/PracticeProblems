/* bayerGroundBeedCalculator.java
 * Description: This program calculates the cost per pound of lean (non-fat) beef for each package and writes out which is the best value
 * created (2021-11-29)
 * Aliya Bayer
 */

package Chapter12_2;

import java.util.Scanner;

public class bayerGroundBeefCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		float priceA, priceB, leanA, leanB, priceLeanA, priceLeanB;
		Scanner input = new Scanner(System.in);
		
		
		//Input
		System.out.println("Price per pound package A: ");  
    	priceA = input.nextFloat(); 
    	System.out.println("Percent lean package A:");  
    	leanA = input.nextFloat(); 
    	
    	System.out.println("Price per pound package B: ");  
    	priceB = input.nextFloat(); 
    	System.out.println("Percent lean package B:");  
    	leanB = input.nextFloat(); 
    	
    	//Processing
    	
    	priceLeanA = priceA * leanA / 100;
    	priceLeanB = priceB * leanB / 100;
    	
    	//Output
    	System.out.print("Package A cost per pound of lean: " + priceLeanA + "\r\n"
    			+ "Package B cost per pound of lean: " + priceLeanB);
    	
    	if (priceLeanA < priceLeanB) {
    		System.out.println("\nPackage A is the best Value");
    	}
    	if (priceLeanA > priceLeanB) {
    		System.out.println("\nPackage B is the best Value");
    	}
	}

}
