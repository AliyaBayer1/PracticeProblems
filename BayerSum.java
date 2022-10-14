/* BayerSum.java
 * Description: This program is to calculate the sum of all numbers 
 * between low and high.
 * @author A. Bayer
 * @version 1.0 (created: Oct 14, 2022  updated: Oct. 14, 2022)
 */
package hellooo;
import java.util.Scanner;

public class BayerSum {

	public static void main(String[] args) {
		//Declaration
		Scanner keyboard = new Scanner (System.in);
		int min, max, sum = 0;
		//Input
		System.out.print("Enter Min:");
		min = keyboard.nextInt ();
		System.out.print("Enter Max:");
		max = keyboard.nextInt ();
		//Processing
		for (int x = min+1; x < max; x++) {
			sum += x; // Add every number in between min and max
		}
		//Output
		System.out.print("The sum of all numbers between " + min + " and " + max + " is " + sum);

	}

}
