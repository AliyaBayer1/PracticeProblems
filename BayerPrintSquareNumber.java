/* BayerPrintSquareNumber.java
 * Description: This program outputs a square pattern related to the positive integer as follows:
 * n = 3
 * 1 2 3
 * 2 3 4
 * 3 4 5
 * @author A. Bayer
 * @version 1.0 (created: Nov. 25, 2022  updated: Nov. 25, 2022)
 */
package shapes;

import java.util.Scanner;

public class BayerPrintSquareNumber {

	public static void main(String[] args) {
		//Declaration
		Scanner keyboard = new Scanner (System.in);
		int n;
		//Input
		System.out.println("Set your number: ");
		n = keyboard.nextInt();
		if (n < 20) {
			//Go over all rows
			for(int x = 1; x <= n; x++) {
				//Go over all elements in a row
				for(int y = 0; y < n; y++) {
					if((y+x) > 9) {
						System.out.print(x + y + " ");
					} else {
						System.out.print(x + y + "  ");
					}
				}
				System.out.println();
			}
		}
	}
}