/* bayerDiscountPrices.java
 * Description: This program a program that asks for the amount of a purchase, then calculates the discounted price. The purchase amount will be input in cents (as an integer)
 * created (2021-11-29)
 * Aliya Bayer
 */

package Chapter12_2;

import java.util.Scanner;

public class bayerDiscountPrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int purchases;
		Scanner input = new Scanner(System.in);
		
		
		//Input
		System.out.println("Enter amount of purchases: ");  
    	purchases = input.nextInt(); 
    	
    	//Processing
    	if (purchases > 1000) {
    		purchases = purchases - purchases / 10;
    	}
    	//Output
		System.out.println("Discounted price: " + purchases);  
	}

}
