/* bayerMidnightMadness.java
 * Description: This program Add logic to the program of exercise 8 to implement the new policy
 * created (2021-11-29)
 * Aliya Bayer
 */
package Chapter12_2;

import java.util.Scanner;

public class bayerMidnightMadness {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int age, time, price = 0;
		Scanner input = new Scanner(System.in);
		
		
		//Input
		System.out.println("How old are you? ");  
    	age = input.nextInt(); 
		System.out.println("When are you going to the movie? ");  
    	time = input.nextInt(); 
    	
    	//Processing
    	if (age >= 13) {
    		if (time < 1700) {
    			price = 5;
    		}
    		if (time > 1700 && time < 2200) {
    			price = 8;
    		}
    		if (time >= 2200) {
    			price = 4;
    		}
    	}
    	if (age < 13) {
    		if (time < 1700) {
    			price = 4;
    		}
    		if (time > 1700 && time < 2200) {
    			price = 2;
    		}
    		if (time >=2200) {
    			price = 0;
    		}
    	}
    	
    	//Output
    	
    	if (price == 0) {
    		System.out.print("NO KIDS ALLOWED");
    	}
    	if (price > 0) {
    		System.out.print("Price for the ticket is: $" + price + ".00");
    	}
	}

}
