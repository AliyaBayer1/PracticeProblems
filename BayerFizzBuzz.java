/* BayerFizzBuzz.java
 * Description: This program prints Fizz for number divisable by 3,
 * Buzz for number divisable by 5, and FizzBizz for number divisable
 * by both 3 and 5. Every other number is printed without text.
 * @author A. Bayer
 * @version 1.0 (created: Sept. 23, 2022  updated: Sept. 23, 2022)
 */
package hellooo;

public class BayerFizzBuzz {

	public static void main(String[] args) {
		//For loop from 1 to 100
		for(int x = 1; x <= 100; x++) {

			if (x % 3 == 0) { // If num is divisable by 3
				System.out.print("Fizz");
			}
			else { // If num is not divisable by 3 or 5
				if (x % 5 == 0) { // If num is divisable by 5
					System.out.print("Buzz");
				} 
				System.out.print(x);
			}
			System.out.println();
			
		}
	}
}