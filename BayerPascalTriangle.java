/* BayerPascalTriangle.java
 * Description: This program outputs a Pascal's Triangle as follows:
 *n = 10
	Pascal's triangle:
 	1  1  1  1  1  1  1  1  1  1 
 	1  2  3  4  5  6  7  8  9 
 	1  3  6 10 15 21 28 36 
 	1  4 10 20 35 56 84 
 	1  5 15 35 70 126 
 	1  6 21 56 126 
 	1  7 28 84 
 	1  8 36 
 	1  9 
 	1 
 * @author A. Bayer
 * @version 1.0 (created: Nov. 29, 2022  updated: Nov. 29, 2022)
 */
package shapes;

import java.util.Scanner;
public class BayerPascalTriangle {
	public static int[][] pascalsTriangle(int n) {
	    int[][] arr = new int[n][];
	    // iterate over the rows of the array
	    for (int i = 0; i < n; i++) {
	        arr[i] = new int[n - i];
	        for (int j = 0; j < n - i; j++) {
	        	//First row
	            if (i == 0 || j == 0) { 
	                arr[i][j] = 1;
	            } else {
	            	//Sum of Number above and on the left
	                arr[i][j] = arr[i][j - 1] + arr[i - 1][j]; 
	            }
	        }
	    }
	    return arr;
	}
	public static void main(String[] args) {
		//Declaration
		Scanner keyboard = new Scanner (System.in);
	    int n;
	    //Input
	    System.out.println("Input a number:");
	    n = keyboard.nextInt();
	    System.out.println("n = " + n);
	    System.out.println("Pascal's triangle:");
	    int[][] arr = pascalsTriangle(n);
	    //Go over all rows
	    for (int[] row : arr) {
	    	//Go over all elements in a row
	        for (int element : row) {
	        	System.out.printf("%3d ", element);
	        }
	        System.out.println();
	    }
	}
}