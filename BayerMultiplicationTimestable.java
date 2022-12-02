/* BayerMultiplicationTimestable.java
 * Description: This program prints a multiplication table.
 * 1 2 3 4  5  6  7  8  9
 * 2 4 6 8 10 12 14 16 18
 * ...
 * @author A. Bayer
 * @version 1.0 (created: Nov. 25, 2022  updated: Nov. 25, 2022)
 */
package shapes;
public class BayerMultiplicationTimestable {
	public static void main(String[] args) {
		//For loop
		for(int x = 1; x <= 10; x++) { //Columns
			for (int y = 1; y <= 10; y++) { //Line
				if (x*y > 9) {
					System.out.print(" " + x * y);
				} else {
					System.out.print("  " + x * y);
				}
			}
			System.out.println();
		}
	}
}