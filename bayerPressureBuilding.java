package Chapter14;

import java.util.Scanner;

public class bayerPressureBuilding {

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
		} if (rightFront + 1 == leftFront || rightFront + 2 == leftFront || rightFront + 3 == leftFront || rightFront == leftFront + 1 || rightFront == leftFront + 2 || rightFront == leftFront + 3 && rightRear + 1 == leftRear || rightRear + 2 == leftRear || rightRear + 3 == leftRear || rightRear == leftRear + 1 || rightRear == leftRear + 2 || rightRear == leftRear + 3){
			System.out.print("Inflation is OK");
		}
		else {
			System.out.print("Inflation is not OK");
		}
	}
}
