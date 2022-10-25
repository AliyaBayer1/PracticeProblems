package src;
import java.util.Scanner;

public class BayerMethodsExercise {
	public static String greeting() { 
		//a method that prints a set greeting one time (no parameters, does not return a value)
		return "Hello!";
	}	
	public static String greeting2(int times, String message) { 		
		/* an overloaded version of the method in #1 (same exact name and return type, 
		 * but with two parameters and does not return a value) that will print a 
		 * message several times.  In the main method, have the user decide how many 
		 * times and what message will be displayed (i.e. get input from the user).
		 */
		String answer = "";	
		while (times != 0) { //Add the string n times
			answer += message;
			times--;
			}
		return answer; //Give an Answer
	}
	public static double divideAdd(double num1, double num2) { 
		// a method that divides the first number by a second number and then adds second number.
		return num1 / num2 + num2;
	}	
	public static boolean isOdd(int number) { 
		/* a Boolean method called isOdd() that determines if a number is odd or not 
		 * (do not use an if statement). This method should return a boolean value.
		 */
		return number % 2 ==1;
	}
	public static void main(String[] args) {
		// Declaration
		Scanner keyboard = new Scanner (System.in);
		double number1 = 3.6, number2 = 6.3;
		// Exercise 2: Greeting 1.0
		System.out.println(greeting());
		
		// Exercise 2: Greeting 2.0
		//Input
		System.out.print("Message that is displayed: ");
		String word = keyboard.nextLine();	
		System.out.print("Number of times the message is displayed: ");
		int number = keyboard.nextInt();	
		//Output
		System.out.println(greeting2(number, word));
		
		// Exercise 3: Calculation
		System.out.println(divideAdd(number1, number2));
		
		// Exercise 4: Is it an odd number?
		System.out.println(isOdd(7));
	}
}
