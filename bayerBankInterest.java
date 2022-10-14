/*bayerBankInterest.java
 * Description: Program asks the user their bank balance and interest rate, then calculates 
 * the interest on their current balance to the nearest cent and displays the result rounded to 
 * two decimal places.  
 * created (2021-11-29)
 * Aliya Bayer
 */
package Exercises4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class bayerBankInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		float balance, rate, interestCurrent;
		Scanner input = new Scanner(System.in);
		DecimalFormat numform = new DecimalFormat("0.00");
		
		//Input
		System.out.print("Your balance: ");  
    	balance = input.nextFloat(); 
    	System.out.print("Your interest rate: ");  
    	rate = input.nextFloat(); 
    	
    	//Processing
    	interestCurrent = balance * rate / 100;
    	
    	//Output
    	System.out.print("Your current interest rate is " + numform.format(interestCurrent));  
	}

}
