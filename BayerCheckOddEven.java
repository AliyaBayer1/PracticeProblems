/* BayerCheckOddEven.java
 * Description: This program checks if the variable is even
 * or odd and prints an answer.
 * @author A. Bayer
 * @version 1.0 (created: Sept. 20, 2022  updated: Sept. 21, 2022)
 */

package hellooo;

public class BayerCheckOddEven {

	public static void main(String[] args) {
		// Declaration
		int num;
		//Calculation & Output
		for (int x = 0; x < 50; x++) { //Repeat the output for 50 times
			num = (int)(Math.random() * (100 - 0) + 0);
			if (num % 2 == 0) { //Check if the number is even
				System.out.println(num + " = Even Number");
			} else { //Check if the number is odd
				System.out.println(num + " = Odd Number");
			}
		}
	}
}