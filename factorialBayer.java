package Chapter17;
import java.util.Scanner;
public class factorialBayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner( System.in );
		long N;
	    double fact = 1; 
	    System.out.print( "Enter N: " );
	    N = scan.nextLong();


	    if ( N >= 0 )
	    {
	      while ( N > 1 )    
	      {
	        fact = fact * N;
	        N = N - 1;
	      }
	      System.out.println( "factorial is " + fact );
	    }
	    else
	    {
	      System.out.println("N must be zero or greater");
	    }
	    
	}
}

