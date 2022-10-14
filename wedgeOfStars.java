package Chapter17;

import java.util.Scanner;

public class wedgeOfStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stars;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter X: \n");
		stars = input.nextInt();
		for (int x = stars; x > 0; x--) {
			for(int y = x; y > 0; y--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
