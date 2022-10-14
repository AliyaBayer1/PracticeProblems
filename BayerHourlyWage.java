/* BayerHourlyWage.java
 * Description: This program reads in the name, hours worked and hourly wage of an employee
 * and outputs how much money they earned this week.
 * @author A. Bayer
 * @version 1.0 (created: Sept. 23, 2022  updated: Sept. 23, 2022)
 */

package hellooo;

import java.util.Scanner;

public class BayerHourlyWage {

	public static void main(String[] args) {
		//Declaration
		Scanner keyboard = new Scanner (System.in);
		String name;
		double hourlyWage, hours, wage;
		final double OVERTIME = 1.5;
		//Input
		System.out.println("Enter your name: ");
		name = keyboard.nextLine();
		System.out.print("Enter your hourly wage: ");
		hourlyWage = keyboard.nextDouble();
		System.out.print("Enter the amount of hours you worked this week:  ");
		hours = keyboard.nextDouble();
		//Calculation
		if (hours > 40) {
			//Calculating overtime salary + standard timed salary
			wage = (hours - 40) * OVERTIME + hours * hourlyWage;
			
		} else if (hours >= 0) {
			//Calculating salary without overtime
			wage = hours * hourlyWage;
		} else {
			//If the hours input is a negative number
			wage = 0;
			System.out.print("You entered a weird number. ");
		}
		//Output
		System.out.println(name + " earned " + wage + "$ this week.");
	}
}