package exercises4;

import java.util.Scanner;

public class calendarBayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month;
		int dayBeginning, numOfDays, spot, daysCount = 0;
		Scanner scan = new Scanner( System.in );
		System.out.print("Enter the name of the month:\t\t\t");
	    month = scan.next();
	    System.out.print("Enter the day of the week the month begins:\t");
	    dayBeginning = scan.nextInt();
	    System.out.print("Enter the number of days in the month:\t\t");
	    numOfDays = scan.nextInt();
	    
	    
	    System.out.println("\t\t\t\t" + month);
	    System.out.println("\tSun\tMon\tTues\tWed\tThurs\tFri\tSat\n");
	    spot = dayBeginning - 1;
	    for(int x = 0; x <= spot; x++) {
	    	System.out.print("\t");
	    }
	    for(int x = 1; x <= (8 - dayBeginning); x++) {
	    	System.out.print(x + "\t");
	    	daysCount = x;
	    }
	    daysCount += 1;
	    System.out.println("");
	    for(int x = daysCount; x < 7 * 2 - dayBeginning + 2; x++) {
	    	daysCount = x;
	    	System.out.print("\t" + x);

	    }
	    daysCount += 1;

	    System.out.println("");
	    for(int x = daysCount; x < 7 * 3 - dayBeginning + 2; x++) {
	    	daysCount = x;
	    	System.out.print("\t" + x);

	    }
	    daysCount += 1;
	    System.out.println("");
	    for(int x = daysCount; x < 7 * 4 - dayBeginning + 2; x++) {
	    	daysCount = x;
	    	System.out.print("\t" + x);
	    	
	    }
	    daysCount += 1;
	    System.out.println("");
	    while (daysCount < numOfDays) {
	    	daysCount += 1;
	    	System.out.print("\t" + daysCount);
		
	    }
	    
	}

}
