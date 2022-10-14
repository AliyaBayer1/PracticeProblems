package Chapter14;

import java.util.Scanner;

public class bayerMoreTirePressure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rightFront, leftFront, rightRear, leftRear; 
		boolean goodPressure = true;
		Scanner input = new Scanner(System.in);
		
		//Input
		System.out.print("Input right front pressure \n");
		rightFront = input.nextInt(); 
		if (rightFront < 35 || rightFront > 45) {
			System.out.print("Warning: pressure is out of range\r\n");
			goodPressure = false;
		}
		System.out.print("\nInput left front pressure \n");
		leftFront = input.nextInt(); 
		if (leftFront < 35 || leftFront > 45) {
			System.out.print("Warning: pressure is out of range\r\n");
			goodPressure = false;
		}
		System.out.print("\nInput right rear pressure \n");
		rightRear = input.nextInt(); 
		if (rightRear < 35 || rightRear > 45) {
			System.out.print("Warning: pressure is out of range\r\n");
			goodPressure = false;
		}
		System.out.print("\nInput left rear pressure \n");
		leftRear = input.nextInt(); 
		if (leftRear < 35 || leftRear > 45) {
			System.out.print("Warning: pressure is out of range\r\n");
			goodPressure = false;
		}
		//Output
		if (goodPressure == false) {
			System.out.print("\nInflation is BAD");
		} else if (rightFront == leftFront || rightRear == leftRear) {
			System.out.print("\nInflation is OK");
		} else {
			System.out.print("\nInflation is not OK");
		}
	}

}
