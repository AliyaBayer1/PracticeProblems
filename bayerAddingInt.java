package Chapter16;

import java.util.Scanner;

public class bayerAddingInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int times, number = 0;
		Scanner input = new Scanner(System.in);
		
		//Input
		System.out.print("How many integers will be added: \n");
		times = input.nextInt(); 
		for(int x = 0; x < times; x++) {
			System.out.print("Enter an integer: \n");
			number += input.nextInt(); 
		}
		System.out.print("The sum is " + number);
	}

}
