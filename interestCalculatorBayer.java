package exercises4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class interestCalculatorBayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double moneyInAccount, interest, interestRate;
		int currentYear, endingYear;
		DecimalFormat numform = new DecimalFormat("0.00");
		Scanner scan = new Scanner( System.in );
		System.out.print("Please enter the starting balance:\t");
	    moneyInAccount = scan.nextDouble();
	    System.out.print("Please enter the current year:\t\t");
	    currentYear = scan.nextInt();
	    System.out.print("Please enter the ending year:\t\t");
	    endingYear = scan.nextInt();
	    System.out.print("Please enter the interest rate:\t\t");
	    interestRate = scan.nextDouble();
	    System.out.print("\nOPENING BALANCE:\t\t\t\t" + moneyInAccount);
	    System.out.print("\n------------------------------------------\n");
		for (int x = currentYear; x <= endingYear; x++) {
			interest = moneyInAccount * (interestRate/100);
			moneyInAccount += interest;
			System.out.println(x + ":\t\t\t\t\t$" + numform.format(moneyInAccount));
		}
	}
}