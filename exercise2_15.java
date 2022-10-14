package Chapter15;

import java.util.Scanner;

public class exercise2_15 {

	public static void main(String[] args) {

		//Variables
		String word; 
		int times;
		Scanner input = new Scanner(System.in);
				
		//Input
		System.out.print("Enter a Word \n");
		word = input.nextLine(); 
		times = word.length();
		
		//Output
		for(int x = 0; x < times; x++) {
			System.out.println(word);
		}
	}
}