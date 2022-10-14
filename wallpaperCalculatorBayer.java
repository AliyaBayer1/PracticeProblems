package Chapter17;

import java.util.Scanner;

public class wallpaperCalculatorBayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area, height, width, length, heightOp, lengthOp;
		int numOpen;
		Scanner input = new Scanner(System.in);
		System.out.print("Everything is in meters\n");
		System.out.print("Enter height \n");
		height = input.nextDouble();
		System.out.print("Enter width \n");
		width = input.nextDouble();
		System.out.print("Enter length \n");
		length = input.nextDouble();
		area = 2 * (width * length +height * length +height * width) * 0.33;
		System.out.print("Enter number of openings \n");
		numOpen = input.nextInt();
		for(int x = 0; x < numOpen; x++) {
			System.out.print("Enter height \n");
			heightOp = input.nextDouble();
			System.out.print("Enter length \n");
			lengthOp = input.nextDouble();
			area -= (heightOp * lengthOp);
		}

		area = (area / (4.1148 * 0.6858));
		area = Math.ceil(area);
		System.out.println(area);
	}
}
