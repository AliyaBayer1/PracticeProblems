/* bayerAgeInSeconds.java
 * Description: This program asks for your age in years, months, and days and writes out your age in seconds
 * 
 * created (2021-11-29)
 * Aliya Bayer
 */

package Chapter12_2;
import java.util.Scanner;

public class bayerAgeInSeconds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int years, months, days, seconds;
		Scanner input = new Scanner(System.in);
		
		
		//Input
		System.out.print("How many years did you live: ");  
    	years = input.nextInt(); 
    	
		System.out.print("How many months did you live: ");  
    	months = input.nextInt(); 
    	
		System.out.print("How many days did you live: ");  
    	days = input.nextInt(); 
    	

    	// Processing
    	if (months == 1) {
    		months = 31;
    	}
    	if (months == 2) {
    		months = 59;
    	}
    	if (months == 3) {
    		months = 90;
    	}
    	if (months == 4) {
    		months = 120;
    	}
    	if (months == 5) {
    		months = 141;
    	}
    	if (months == 6) {
    		months = 171;
    	}
    	if (months == 7) {
    		months = 202;
    	}
    	if (months == 8) {
    		months = 233;
    	}
    	if (months == 9) {
    		months = 263;
    	}
    	if (months == 10) {
    		months = 294;
    	}
    	if (months == 11) {
    		months = 324;
    	}
    	if (months == 12) {
    		months = 355;
    	}
    	
    	seconds = years * 365 * 24 * 60 * 60;
    	seconds += months * 24 * 60 * 60;
    	seconds += days * 24 * 60 * 60;
    	
    	//Output
    	System.out.println("You lives for " + seconds + " seconds.");  
	}
}
