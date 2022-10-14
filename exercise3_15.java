package Chapter15;

import java.util.Scanner;

public class exercise3_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		String first, second;
		int sum;
		Scanner input = new Scanner(System.in);
		
		//Input
		System.out.print("Enter First Word \n");
		first = input.nextLine(); 
		System.out.print("Enter Second Word \n");
		second = input.nextLine(); 
		
		sum = first.length();
		sum += second.length();
		//Output
		System.out.print(first);
		for(int x = 30; x > sum; x--) {
			System.out.print(".");
		}
		System.out.print(second);
	}

}
