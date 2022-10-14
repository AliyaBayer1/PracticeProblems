package Chapter16;

import java.util.Scanner;

public class bayerExercise3_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int times;
		double sum = 0, avgSqr = 0, avg = 0, SD = 0, num;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N: \n");
		times = input.nextInt();
		
		for(int x = 0; x < times; x++) {
			num = input.nextDouble();
			sum += num;
			avgSqr += num * num;
		}
		avg = sum / times;
		avg *= avg;
		avgSqr = avgSqr / times;
		SD = Math.sqrt(avgSqr - avg);
		System.out.print(SD);
		
	}
}