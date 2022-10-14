/* BayerPrintDayInWord.java
 * Description: This program prints prints Sunday,Monday, ... ,Saturday if the int 
 * variable day is 0, 1,..., 6, respectively. Otherwise, it shall print Not a valid day.
 * @author A. Bayer
 * @version 1.0 (created: Sept. 23, 2022  updated: Sept. 23, 2022)
 */
package hellooo;

public class BayerPrintDayInWord {

	public static void main(String[] args) {
		//Declaration
		int number;
		for (int x = 0; x < 40; x++) { //Test for 40 times
			number = (int)(Math.random() * (10 - 0) + 0);
			//Output
			switch (number) //switch case
			{
			case 0:System.out.println(number + " = Sunday");break;
			case 1:System.out.println(number + " = Monday");break;
			case 2:System.out.println(number + " = Tuesday");break;
			case 3:System.out.println(number + " = Wednesday");break;
			case 4:System.out.println(number + " = Thursday");break;
			case 5:System.out.println(number + " = Friday");break;
			case 6:System.out.println(number + " = Saturday");break;
			//If the number is NOT 0-6
			default:System.out.println(number + " = Not a valid day"); 
			}
		}
	}

}
