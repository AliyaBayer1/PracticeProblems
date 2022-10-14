/* BayerCheckPassFail.java
 * Description: This program prints PASS if the integer variable 
 * mark is greater than or equal to 50; or prints FAIL otherwise.
 * @author A. Bayer
 * @version 1.0 (created: Sept. 20, 2022  updated: Sept. 20, 2022)
 */
package hellooo;

public class BayerCheckPassFail {

	public static void main(String[] args) {
		// Declaration
		int num;
		////Calculation & Output
		for (int x = 0; x < 50; x++) { //Repeat the output for 50 times
			num = (int)(Math.random() * (100 - 0) + 0);
			//Output
			if (num >= 50) { 
				System.out.println(num + " = PASS");
			} else {
				//if number is < 50
				System.out.println(num + " = FAIL");
			}
		}
	}

}
