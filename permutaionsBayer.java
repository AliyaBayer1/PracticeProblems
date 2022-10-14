package Chapter17;

import java.util.Scanner;

public class permutaionsBayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner( System.in );
		long N, R;
	    double fact = 1; 

	    System.out.print( "Enter N: " );
	    N = scan.nextLong();
	   
	    System.out.print( "Enter R: " );
	    R = scan.nextLong();
	    if (N < 0 || R < 0 || R >= N) {
	    	System.out.print( "Error" );
	    } else {
	    	if ( N >= 0 )
		    {
		      while ( N > 1 )    
		      {
		        fact = fact * N;
		        N = N - R;
		      }
		      System.out.println( "factorial is " + fact );
		    }
		    else
		    {
		      System.out.println("N must be zero or greater");
		    }
	    }
	}
}