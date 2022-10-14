/* BayerExtractDigits.java
 * Description: This program outputs last and first digits of a number
 * @author A. Bayer
 * @version 1.0 (created: Oct 14, 2022  updated: Oct. 14, 2022)
 */
package hellooo;

import java.util.Scanner;

public class BayerExtractDigits {
	public static int lastDigit(int digits) {
		 return Math.abs(digits) % 10; //Make the value absolute and find the last digit by reminder
	}
	public static int firstDigit(int digits) {
		while (digits > 10) { //Divide until the number is only 1 char long
			digits /= 10;
		}
		return digits; //Output first digit
	}
	public static void main(String[] args) {
		// Declaration
		Scanner keyboard = new Scanner (System.in);
		//Input
		int number = keyboard.nextInt();
		//Output
		System.out.print("Last digit: " + lastDigit(number) + "\nFirst Digits: " + firstDigit(number));
	}
}