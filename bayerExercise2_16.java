package Chapter16;

import java.util.Scanner;

public class bayerExercise2_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int times;
		double sum = 0;
		Scanner input = new Scanner(System.in);
		
		//Input
		System.out.print("Enter N: \n");
		times = input.nextInt();
		for (int x = 1; x < times; x++) {
			sum += 1.0/x;
		}
		System.out.print("The sum is " + sum);
		//sum = 1.0/1 + 1.0/2 + 1.0/3 + 1.0/4 + 1.0/5 + .... + 1.0/N
	}

}
