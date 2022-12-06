package src;
import java.util.Scanner;
public class BayerPerfectNumbers {
	public static boolean PerfectNumbers(long num) {
		long sum = 0;
		for(long x = 1; x < num/2+1; x++) {
			if(num % x == 0) {
				sum+= x;
			}
		}
		return (sum == num);
	}
	public static void main(String[] args) {
		//Declaration
		Scanner keyboard = new Scanner (System.in);
		long num;
		System.out.print("Enter an integer: ");
		num = keyboard.nextLong();
		System.out.print(PerfectNumbers(num));
	}
}