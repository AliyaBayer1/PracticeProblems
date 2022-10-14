/* Name: twoArraysBayer.java
 * Description: This program completes the program so that a new array twice is constructed, 
 * copy values from val to twice, but make the values in twice double what they are in val.
 * 
 * Aliya Bayer
 * Date: (2021-12-16)
 */
package Chapter46;

public class twoArraysBayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variable
		int[] val = {13, -4, 82, 17}; 
	    int[] twice = new int[4];
	    
	    //Output
	    System.out.println( "Original Array: " 
	        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
	    //Processing
	    twice[0] = val[0] * 2;
	    twice[1] = val[1] * 2;
	    twice[2] = val[2] * 2;
	    twice[3] = val[3] * 2;

	    //Output
	    System.out.println( "New Array: " 
	        + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );
	}
}
