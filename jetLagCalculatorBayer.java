package Chapter17;

import java.util.Scanner;

public class jetLagCalculatorBayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double hours, zones, depart, arrive;
		double daysOfRecovery;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter hours \n");
		hours = input.nextDouble();
		System.out.print("Enter zones \n");
		zones = input.nextDouble();
		System.out.print("Enter depart \n");
		depart = input.nextDouble();
		System.out.print("Enter arrive \n");
		arrive = input.nextDouble();
		daysOfRecovery = (hours/2 + (zones-3) + depart + arrive)/10;
		System.out.print(daysOfRecovery);
	}

}
