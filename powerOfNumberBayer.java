package Chapter17;

import java.util.Scanner;

public class powerOfNumberBayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		double x, sum = 1;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter X: \n");
		x = input.nextDouble();
		System.out.print("Enter N: \n");
		n = input.nextInt();
		if (n < 0){
			System.out.print("N must be a positive integer.");
		}
		if (n > 0) {
			for(int y = 0; y < n; y++) {
				sum *= x;
			}
			System.out.print(sum);
		}
	}
}
