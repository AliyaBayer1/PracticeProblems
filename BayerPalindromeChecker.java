/* BayerPalindromeCheck.java
 * Description: This program outputs if the String is a Palindrome.
 * @author A. Bayer
 * @version 1.0 (created: Dec. 02, 2022  updated: Dec. 02, 2022)
 */
import java.util.Scanner;
public class BayerPalindromeChecker {
	/** isPalindrome
	* This method will print if the word is a palindrome
	* 
	* @param word
	* String
	* @return
	* boolean 
	*/
	public static boolean isPalindrome(String word) {
		String reverseWord = "";
		//Delete all spaces
		word = word.replaceAll("\\s+","");
		int wordLength = word.length();
		//Reverse the word
		for (int x = (wordLength -1); x >= 0; x--) { 
			reverseWord = reverseWord + word.charAt(x);
		}
		return word.equals(reverseWord);
	}
	public static void main(String[] args) {
		//Declaration
		Scanner keyboard = new Scanner (System.in);
		String str;
		//Input
		System.out.println("Write a string to check if it is a palindrome: ");
		str = keyboard.nextLine();
		//Output
		System.out.println(isPalindrome(str));
	}
}

