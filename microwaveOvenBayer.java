package Chapter13;

import java.util.Scanner;

public class microwaveOvenBayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int times;
		double heatTime, recommended;
		Scanner scan = new Scanner( System.in );
		System.out.print("number of items: ");
	    times = scan.nextInt();
	    System.out.print("single-item heating time: ");
	    heatTime = scan.nextInt();
	    
	    if (times == 2) {
	    	recommended = heatTime * 1.5;
	    	 System.out.print("recommended heating time.: " + recommended);
	    }
	    if (times == 3) {
	    	recommended = heatTime * 2;
	    	System.out.print("recommended heating time.: " + recommended);
	    }
	    if (times == 1) {
	    	recommended = heatTime;
	    	System.out.print("recommended heating time.: " + recommended);
	    }
	    if (times > 3) {
	    	System.out.print("Heating more than three items at once is not recommended.");
	    }
	   
	}

}
