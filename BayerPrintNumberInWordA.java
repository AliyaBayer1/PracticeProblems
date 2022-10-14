/* BayerPrintNumberInWordA.java
 * Description: This program prints ONE, TWO, ... , NINE, OTHER if
 * the int variable number; is 1, 2, ... , 9, or other, respectively using nested-if
 * @author A. Bayer
 * @version 1.0 (created: Sept. 21, 2022  updated: Sept. 21, 2022)
 */
package hellooo;
public class BayerPrintNumberInWordA {
	public static void main(String[] args) {
		//Declaration
		int number;
		for (int x = 0; x < 50; x++) { //Test for 50 times
			number = (int)(Math.random() * (20 - 0) + 0);
			//Calculation + Output
			if (number <=9 && number >= 1) {
				if (number == 1) {
					System.out.println(number + " = ONE");
				}
				if (number == 2) {
					System.out.println(number + " = TWO");
				}
				if (number == 3) {
					System.out.println(number + " = THREE");
				}
				if (number == 4) {
					System.out.println(number + " = FOUR");
				}
				if (number == 5) {
					System.out.println(number + " = FIVE");
				}
				if (number == 6) {
					System.out.println(number + " = SIX");
				}
				if (number == 7) {
					System.out.println(number + " = SEVEN");
				}
				if (number == 8) {
					System.out.println(number + " = EIGHT");
				}
				if (number == 9) {
					System.out.println(number + " = NINE");
				}
			} else {
					//If the number is NOT 1-9
				    System.out.println(number + " = OTHER");
			}
		}
	}
}