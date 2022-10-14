/* BayerPowers.java
 * Description: This program accepts a base and an exponent as 
 * parameters and returns the base raised to the given power.
 * @author A. Bayer
 * @version 1.0 (created: Oct 14, 2022  updated: Oct. 14, 2022)
 */
package hellooo;

import java.util.Scanner;

public class BayerPowers { // Method to power the number
	public static int pow(int num, int exp) {
		int answer = 1;
		while (exp != 0) { //Power the value n times
			answer *= num;
			exp--;
		}
		return answer; //Give an Answer
	}
	public static void main(String[] args) {
		//Declaration
		Scanner keyboard = new Scanner (System.in);
		int base, power;
		//Input
		System.out.print("Enter base:");
		base = keyboard.nextInt ();
		System.out.print("Enter power:");
		power = keyboard.nextInt ();
		//Output
		System.out.print(pow(base,power));
	}
}