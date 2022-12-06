package src;

import java.util.Scanner;

public class BayerLargestNumber {
	public static double largestNumber() {
		//Declaration
		Scanner keyboard = new Scanner (System.in);
		double high = 0, num = 0;
		//Input
		System.out.println("Enter positive numbers (decimals allowed). Enter a negative number to stop.");
		for(int x = 1; x >= 0; x++) {
			System.out.print("Number " + x + ": ");
			num = keyboard.nextDouble();
			if(num > high) {
				high = num;
			} 
			if(num < 0) {
				break;
			}
		}
		return high;
	}
	public static void main(String[] args) {
		double number = largestNumber();
		System.out.print("The largest number entered was ");
		if(number % 1 ==0) {
			System.out.print((int)number + ".");
		} else {
			System.out.print(number+ ".");
		}

	}
}
