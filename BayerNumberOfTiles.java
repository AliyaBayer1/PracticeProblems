/* BayerNumberOfTiles.java
 * Description: This program is to calculate the highest amount of 
 * square tiles that fit on the floor.
 * @author A. Bayer
 * @version 1.0 (created: Oct 20, 2022  updated: Oct. 20, 2022)
 */

package hellooo;

import java.util.Scanner;
public class BayerNumberOfTiles {

	public static int tiles(int width, int length) {
		
		//Declaration
		int numberOfTiles = 0;
		//greatest common factor of width and length
		for(int i = 1; i <= width && i <= length; i++)  
		{  
			//if width and length is divided by i, store i in the numberOfTiles variable  
			if(width%i==0 && length%i==0) { 
				numberOfTiles = i;
			}  
		}  
		return numberOfTiles;
	}
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		Scanner keyboard = new Scanner (System.in);
		int widthTile = 570;
		int lengthTile = 10000;
		//Output
		System.out.print("You need (" + tiles(widthTile,lengthTile) + " x " + tiles(widthTile,lengthTile) + ") tiles");
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}
	
}