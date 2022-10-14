package Chapter15;

import java.util.Scanner;

public class exercise1_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int firstNum, secondNum; 
		Scanner input = new Scanner(System.in);
				
		//Input
		System.out.print("Enter Start \n");
		firstNum = input.nextInt(); 
		System.out.print("Enter Finish \n");
		secondNum = input.nextInt(); 
		
		for(int x = firstNum; x <= secondNum; x++) {
			System.out.println(x);
		}
	}

}
