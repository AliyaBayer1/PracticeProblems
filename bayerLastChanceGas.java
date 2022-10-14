/* bayerLastChanceGas.java
 * Description: This program Write a program to help drivers decide if they need gas.
 * created (2021-11-29)
 * Aliya Bayer
 */
package Chapter12_2;

import java.util.Scanner;

public class bayerLastChanceGas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int capacity, reading, milesPerGallon, result;
		Scanner input = new Scanner(System.in);
		
		
		//Input
		System.out.println("Enter Tank Capacity: ");  
    	capacity = input.nextInt(); 
		System.out.println("Enter Gage Reading: ");  
    	reading = input.nextInt(); 
		System.out.println("Enter Miles per gallon: ");  
    	milesPerGallon = input.nextInt(); 
		//Processing
    	result = capacity * reading / 100;
    	result *= milesPerGallon;
    	//Output
    	System.out.print("Tank capacity:\r\n"
				+ capacity + "\r\n"
				+ "Gage reading:\r\n"
				+ reading + "\r\n"
				+ "Miles per gallon:\r\n"
				+ milesPerGallon + "\r\n");
    	if (result > 199) {
    		System.out.println("Safe to Proceed");  
    	} else {
    		System.out.println("Get Gas!");  
    	}
	}
}
