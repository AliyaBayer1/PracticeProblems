package Chapter14;

import java.util.Scanner;

public class bayerCheckCharge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		double checking, saving;
		Scanner input = new Scanner(System.in);

		//Input
		System.out.print("Enter amount of money in checking account $");  
    	checking = input.nextDouble(); 
		System.out.print("Enter amount of money in saving account $");  
    	saving = input.nextDouble(); 
    	if (checking > 1000 || saving > 1500) {
    		System.out.print("Your service fee is free");
    	} else {
    		System.out.print("Your service fee is $0.15 per check");    	}
	}

}
