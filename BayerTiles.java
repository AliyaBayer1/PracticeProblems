/* BayerTiles.java
 * Description: This program is to calculate the highest amount of 
 * square tiles that fit on the floor.
 * @author A. Bayer
 * @version 1.0 (created: Oct 20, 2022  updated: Oct. 20, 2022)
 */
package hellooo;
import java.util.Scanner;

public class BayerTiles {
	public static int tiles(int width, int length) {
		//Declaration
		int numberOfTiles = 0;
		
		//Make Width bigger than length
		if (width < length) {
			int l = width;
			width = length;
			length = l;
		}
		//greatest common factor of width and length
		for(int i = 1; i <= (width / 2) + 1 && i <= length; i++)  
		{  
			//if width and length is divided by i, store i in the numberOfTiles variable  
			if(width%i==0 && length%i==0) { 
				numberOfTiles = i;
			}  
		}  
		//If width and length are the same, we need 
		if (width == length) {
			numberOfTiles = width;
		}
		return numberOfTiles;
	}
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		//Input
		System.out.print("Enter the floor length (cm): ");
		int lengthTile = keyboard.nextInt();
		System.out.print("Enter the floor width (cm): ");
		int widthTile = keyboard.nextInt();
		//Output
		System.out.print("You need (" + tiles(widthTile,lengthTile) + " x " + tiles(widthTile,lengthTile) + ") tiles");
	}
}