package Chapter14;

import java.util.Scanner;

public class bayerTirePressure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		int rightFront, leftFront, rightRear, leftRear; 
		Scanner input = new Scanner(System.in);
		
		//Input
		System.out.print("Input right front pressure \n");
		rightFront = input.nextInt(); 
		System.out.print("Input left front pressure \n");
		leftFront = input.nextInt(); 
		System.out.print("Input right rear pressure \n");
		rightRear = input.nextInt(); 
		System.out.print("Input left rear pressure \n");
		leftRear = input.nextInt(); 
		
		//Output
		if (rightFront == leftFront && rightRear == leftRear) {
			System.out.print("Inflation is OK");
		} else {
			System.out.print("Inflation is not OK");
		}
	}

}
