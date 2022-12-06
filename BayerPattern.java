package src;
import java.util.Scanner;
public class BayerPattern {
	public static void squarePattern(int num, String letter) {
		for(int y = 1; y <= num; y++) { //Rows
			if (y == 1 || y == num) { //First and last row
				for(int x =0; x< num; x++) {
					System.out.print(letter +" ");
				}	
				System.out.println();
			} else { //In-between rows
				System.out.print(letter +" ");
				for(int z = 1; z< num-1; z++) {
					System.out.print("  ");
				}
				System.out.println(letter +" ");
			}
		}
	}
	public static void main(String[] args) {
		//Declaration
		int size;
		String symbol;
		Scanner keyboard = new Scanner (System.in);
		//Input
		System.out.println("Write a size of a pattern: ");
		size = keyboard.nextInt();
		System.out.println("Enter a symbol: ");
		symbol = keyboard.next();
		squarePattern(size, symbol);
	}
}