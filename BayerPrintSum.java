package src;
import java.util.Scanner;
public class BayerPrintSum {
	public static void printSum(int low, int high) {
		int sum = low;
		System.out.print("Series from " + low + " to " + high + ": ");
		System.out.print(low);
		for(int y = low+ 1; y <= high; y++) {
			System.out.print(" + " +  y);
			sum += y;
		}
		System.out.println("\nSum: " + sum);

	}
	public static void main(String[] args) {
		//Declaration
		int num1, num2;
		Scanner keyboard = new Scanner (System.in);
		//Input
		System.out.println("Write the lowest number: ");
		num1 = keyboard.nextInt();
		System.out.println("Write the highest number: ");
		num2 = keyboard.nextInt();
		printSum(num1, num2);
	}

}
