/* BayerNames.java
 * Description: This program reads names typed by the 
 * user and prints the longest name
 * @author A. Bayer
 * @version 1.0 (created: Oct 14, 2022  updated: Oct. 14, 2022)
 */
package hellooo;

import java.util.Scanner;
import java.util.ArrayList;
public class BayerNames {
	public static String longestName(int times) {
		//Declaration
		Scanner keyboard = new Scanner (System.in);
		ArrayList<String> nameList = new ArrayList<String>();
		int maxLength = 1, nameLength;
		String finalName = "";
		//Input
		for(int x = 1; x <= times; x ++) { //Ask the user to input x number of names
			System.out.print("name #" + x + "? ");
			String name = keyboard.next();
			nameList.add(name);
		}
		for(int y = 0; y < nameList.size();y++) { //Compare length of names to each another to get the longest one
			nameLength = (nameList.get(y)).length();
			if (nameLength > maxLength) {
				maxLength = nameLength;
				finalName = nameList.get(y);
			}
		}
		return finalName; //Return the longest name from the inputted names
	}
	public static void main(String[] args) {
		// Declaration
		Scanner keyboard = new Scanner (System.in);
		// Input how many names to enter
		System.out.print("Enter the amount of names: ");
		int number = keyboard.nextInt();
		//Output
		System.out.print(longestName(number) + "'s name is longest");
	}

}
