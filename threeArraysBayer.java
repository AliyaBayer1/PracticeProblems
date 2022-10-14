/* Name: threeArraysBayer.java
 * Description: This program completes the program with four assignment statements so that each cell of sum contains 
 * the sum of the corresponding cells in valA and valb. Ie., add cell zero of valA to cell zero of valB and put the 
 * result in cell zero of sum, and so on.
 * 
 * Aliya Bayer
 * Date: (2021-12-16)
 */
package Chapter46;

public class threeArraysBayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variable
		int[] valA   = { 13, -22,  82,  17}; 
	    int[] valB   = {-12,  24, -79, -13};
	    int[] sum    = {  0,   0,   0,   0};
	    
	    // Add values from corresponding cells of valA and valB
	    // and put the result in the corresponding cell of sum.
	    //Processing
	    sum[0] = valA[0] + valB[0];
	    sum[1] = valA[1] + valB[1];
	    sum[2] = valA[2] + valB[2];
	    sum[3] = valA[3] + valB[3];
	    //Output
	    System.out.println( "sum: " 
	        + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );
	}

}
