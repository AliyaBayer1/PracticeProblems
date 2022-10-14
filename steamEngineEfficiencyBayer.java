package Chapter13;

import java.util.Scanner;

public class steamEngineEfficiencyBayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float Tair, Tsteam, efficiency;
		Scanner scan = new Scanner( System.in );
		System.out.print("Air temperature: ");
	    Tair = scan.nextFloat();
	    System.out.print("Steam temperature: ");
	    Tsteam = scan.nextFloat();
	    if (Tsteam < 373) {
	    	efficiency = 0;
	    } else {
	    	efficiency = 1 - Tair / Tsteam;
	    }
	    System.out.print("maximum possible efficiency of a steam engine: " + efficiency);
	    
	}

}
