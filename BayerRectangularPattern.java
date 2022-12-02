/* BayerRectangularPattern.java
 * Description: This program outputs a rectangular pattern related to the positive integer as follows:
 * n = 10
   **********1
   ** * * *  2
   * *  *  * 3
   ** *   *  4
   *   *     5
   ***  *    6
   *     *   7
   ** *   *  8 
   * *     * 9
   **  *    *10
 * @author A. Bayer
 * @version 1.0 (created: Nov. 29, 2022  updated: Nov. 29, 2022)
 */
package shapes;

import java.util.Scanner;

public class BayerRectangularPattern {
	public static void main(String[] args) {
		//Declaration
		Scanner keyboard = new Scanner (System.in);
		int n;
		//Input
		System.out.println("Set your number: ");
		n = keyboard.nextInt();
		//Go over all rows
		for(int x = 1; x <= n; x++) {
			//Go over all elements in a row
			for(int y = 1; y <= n; y++) {
				if(x%y==0 || y % x == 0) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(x);
		}
	}
}