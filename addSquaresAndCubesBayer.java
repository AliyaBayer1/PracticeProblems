package Chapter17;

import java.util.Scanner;

public class addSquaresAndCubesBayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		double squares, cubes;
		Scanner input = new Scanner(System.in);
		System.out.print("Upper Limit: \n");
		n = input.nextInt();
		squares = n * (n+1) * (2*n+1)/6;
		cubes =  n*n*(n+1)*(n+1)/4;
		System.out.print("Squares: " + squares + ". Cubes: " + cubes);
	}

}
