/* BayerNarcissisticNum.java
 * Description: This program is to calculate narcissistic numbers
 * @author A. Bayer
 * @version 1.0 (created: Oct 18, 2022  updated: Oct. 18, 2022)
 */
package hellooo;

import java.util.Scanner;

public class BayerNarcissisticNum {
	public static String is_narcissistic(int number) {
		//Declaration
		int digit = 0, temp, loops, answer;
		String printed;
		answer = number;
		loops = String.valueOf(number).length();
		//Running every digit
		while (number > 0) {
			temp = 1;
			for (int x = 0; x < loops; x++) {
				temp *= (number % 10);
			}
			number/=10;
			digit += temp;
		}
		//if the number is narcissistic
		if (digit == answer) {
			printed = "True";	
		} else {
			printed = "False";	
		}
		return printed;
		
	}

	public static void main(String[] args) {
		//Input
		Scanner keyboard = new Scanner (System.in);
		int input = keyboard.nextInt();
		//Output
		System.out.print(is_narcissistic(input));
	}
}