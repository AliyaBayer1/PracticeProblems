/* Name: reverseOrderBayer.java
 * Description: This program makes the numbers in the array appear in reversed order using variable temp.
 * Aliya Bayer
 * Date: (2021-12-16)
 */
package Chapter46;

public class reverseOrderBayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variable
		int[] val = {0, 1, 2, 3}; 
	    int temp;
	 
	    System.out.println( "Original Array: " 
	        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
	    //Processing
	    temp = val[0];
	    val[0] = val[3];
	    val[3] = temp;
	    temp = val[1];
	    val[1] = val[2];
	    val[2] = temp;

	    //Output
	    System.out.println( "Reversed Array: " 
	        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
	}

}
