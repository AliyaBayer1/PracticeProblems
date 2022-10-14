/* BayerDaysAlive.java
 * Description: This program is to calculate the total number
 * of days the user lives and how much they spent sleeping. 
 * @author A. Bayer
 * @version 1.0 (created: Sept. 16, 2022  updated: Sept. 16, 2022)
 */
package hellooo;

import java.util.Scanner;

public class BayerDaysAlive {

	public static void main(String[] args) {
		//Declaring
		Scanner keyboard = new Scanner (System.in);
		int daysTotal, hoursTotal;
		//Input
		System.out.println("Enter your birthdate...");
		System.out.print("\nYEAR:\t\t");
		int yearBirth = keyboard.nextInt ();
		System.out.print("MONTH:\t\t");
		int monthsBirth = keyboard.nextInt ();
		if (monthsBirth > 12){
			System.out.print("We live on planet Earth, not Mars. We only have 12 months.");
			System.exit(0);
		}
		if (monthsBirth < 1){
			System.out.print("We live on planet Earth. We don't have negative or null months");
			System.exit(0);
		}
		System.out.print("DAY:\t\t");
		int daysBirth = keyboard.nextInt();
		if (daysBirth > 365){
			System.out.print("We live on planet Earth, not Mars. We only have 365 days.");
			System.exit(0);
		}
		if (daysBirth < 0){
			System.out.print("We live on planet Earth. We don't have negative days because we are positive and optimistic.");
			System.exit(0);
		}
		System.out.println("\nEnter today's date:");
		System.out.print("\nYEAR:\t\t");
		int yearToday = keyboard.nextInt ();
		if (yearBirth > yearToday) {
			System.out.print("Are you a time traveler? You seem to be not born yet.");
			System.exit(0);
		}
		System.out.print("MONTH:\t\t");
		int monthsToday = keyboard.nextInt ();
		if (monthsToday > 12){
			System.out.print("We live on planet Earth, not Mars. We only have 12 months.");
			System.exit(0);
		}
		if (monthsToday < 1){
			System.out.print("We live on planet Earth. We don't have negative or null months");
			System.exit(0);
		}
		System.out.print("DAY:\t\t");
		int daysToday = keyboard.nextInt();
		if (daysToday > 365){
			System.out.print("We live on planet Earth, not Mars. We only have 365 days.");
			System.exit(0);
		}
		if (daysToday < 0){
			System.out.print("We live on planet Earth. We don't have negative days because we are positive and optimistic.");
			System.exit(0);
		}
		//Calculations
		int yearsTotal = yearToday - yearBirth;
		int monthsTotal = monthsToday - monthsBirth;
		daysTotal = daysToday - daysBirth;
		if (daysTotal < 0) {
			monthsTotal -= 1;
			daysTotal += 30;
		}
		if (monthsTotal < 0) {
			yearsTotal -= 1;
			monthsTotal += 12;
		}
		daysTotal = yearsTotal * 365 + monthsTotal * 30 + daysToday;
		hoursTotal = daysTotal * 8;
		//Output
		System.out.println("\nYou have been alive for " + daysTotal + " days!");
		System.out.println("You have slept for " + hoursTotal + " hours!");
	}

}
