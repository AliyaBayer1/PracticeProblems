/* CombinationLockA.java
 * Description: This program asks a user to set a dial and asks a
 * combination afterwards.
 * @author A. Bayer
 * @version 1.0 (created: Sept. 23, 2022  updated: Sept. 23, 2022)
 */
package hellooo;

import java.util.Scanner;

public class CombinationLock {

	public static void main(String[] args) {
		//Declaration
		Scanner keyboard = new Scanner (System.in);
		String dial = "", attemptDial, shortAttempt;
		int cont = 0;
		
		//Input
		while (cont == 0) {
			System.out.println("Set your dial number: ");
			dial = keyboard.next();
			if (dial.length() != 3) {
				System.out.println("Your password needs to be 3 dials long!");
			} else {
				cont +=1;
			}
		}
		while (cont == 1) { //While Loop Until the User guesses the dial
			System.out.println("Enter your dial number: ");
			attemptDial = keyboard.next();
			if (dial.equals(attemptDial)) { // if dial equals to the user input
				System.out.println("You unlocked your Lock!");
			} else if (attemptDial.length() < dial.length()){ //
				System.out.print("");
			} else {
				//Take last three dial characters
				shortAttempt = attemptDial.substring(attemptDial.length()-dial.length(), attemptDial.length());
				if (shortAttempt.equals(dial)) {
					System.out.println("You unlocked your Lock!");
				}
			}
		}
	}
}