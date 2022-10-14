/* BayerMumble.java
 * Description: This program accepts a string and an integer number of
 * repetitions as parameters, and returns the string concatenated that many times.
 * @author A. Bayer
 * @version 1.0 (created: Oct 14, 2022  updated: Oct. 14, 2022)
 */
package hellooo;

import java.util.Scanner;

public class BayerMumble {
	public static String repl(String word, int times) {
		String answer = "";	
		while (times != 0) { //Add the string n times
			answer += word;
			times--;
			}
			return answer; //Give an Answer
		}
	public static void main(String[] args) {
		//Declaration
		Scanner keyboard = new Scanner (System.in);
		int number;
		String inputWord;
		//Input
		System.out.print("Enter a word:");
		inputWord = keyboard.nextLine();
		System.out.print("Enter how many times:");
		number = keyboard.nextInt ();
		//Output
		System.out.print(repl(inputWord,number));
	}
}
