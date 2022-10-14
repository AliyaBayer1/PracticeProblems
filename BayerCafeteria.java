/* BayerCafeteria.java
 * Description: This program is to calculate the total 0f
 * cafeteria foods.
 * 
 * @author A. Bayer
 * @version 1.0 (created: Sept. 16, 2022  updated: Sept. 16, 2022)
 */
package hellooo;

import java.util.Scanner;
import java.text.DecimalFormat;

public class BayerCafeteria {

	public static void main(String[] args) {
		// Declaring
		final double BURGERPRICE = 2.99, FRIESPRICE = 1.99, POPPRICE = 0.99, TAX = 0.13;
		final DecimalFormat df = new DecimalFormat("$0.00");
		Scanner keyboard = new Scanner (System.in);
		
		//Input
		System.out.print("Enter the number of burgers:\t");
		int Nburger = keyboard.nextInt ();
		if (Nburger < 0) {
			System.out.print("Next time enter a positive integer");
			System.exit(0);
		}
		System.out.print("Enter the number of fries:\t");
		int Nfries = keyboard.nextInt ();
		if (Nfries < 0) {
			System.out.print("Next time enter a positive integer");
			System.exit(0);
		}
		System.out.print("Enter the number of pops:\t");
		int Npops = keyboard.nextInt ();
		if (Npops < 0) {
			System.out.print("Next time enter a positive integer");
			System.exit(0);
		}
		//Calculation
		double subtotal = Nburger * BURGERPRICE + Nfries * FRIESPRICE + Npops * POPPRICE;
		double HST = subtotal * TAX;
		double grandTotal = subtotal + HST;
		
		//Output
		System.out.println("\nSUBTOTAL:\t\t\t" + df.format(subtotal));
		System.out.println("HST:\t\t\t\t" + df.format(HST));
		System.out.println("GRAND TOTAL:\t\t\t" + df.format(grandTotal));
		
		
		// Second Input
		System.out.print("\nAMOUNT TENDERED:\t\t");
		double amountTendered = keyboard.nextDouble ();
		
		//Second Calculation
		double change = amountTendered - grandTotal;
		if (change < 0) {
			System.out.println("Next time try not to scam us by giving less money.");
			System.exit(0);
		}
		//Second Output
		System.out.print("CHANGE:\t\t\t\t" + df.format(change));
	}

}
