package Chapter13;

import java.util.Scanner;

public class fantasyGameBayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int strength, health, luck, total;
		String name;
		Scanner scan = new Scanner( System.in );
		System.out.print("Welcome to Yertle's Quest\r\nEnter the name of your character:\n");
	    name = scan.nextLine();
		System.out.println("Enter strength (1-10):");
	    strength = scan.nextInt();
	    System.out.println("Enter health (1-10):");
	    health = scan.nextInt();
	    System.out.println("Enter luck (1-10):");
	    luck = scan.nextInt();
	    total = luck + health + strength;
	    if (total > 15) {
	    	System.out.println("You have give your character too many points!  Default values have been assigned:");
	    	luck = 5; 
	    	health = 5;
	    	strength = 5;
	    }
	    System.out.println(name + ", strength: " + strength + ", health: " + health + ", luck: " + luck);
	}

}
