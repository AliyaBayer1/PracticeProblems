/* BayerPrintNumberInWord.java
 * Description: This program prints ONE, TWO, ... , NINE, OTHER if
 * the int variable number; is 1, 2, ... , 9, or other, respectively using switch case
 * @author A. Bayer
 * @version 1.0 (created: Sept. 21, 2022  updated: Sept. 21, 2022)
 */
package hellooo;
public class BayerPrintNumberInWord {
	public static void main(String[] args) {
		//Declaration
		int number;
		for (int x = 0; x < 50; x++) { //Test for 50 times
			number = (int)(Math.random() * (15 - 0) + 0);
			switch (number) //switch case
			{
			case 1:System.out.println(number + " = ONE");break;
			case 2:System.out.println(number + " = TWO");break;
			case 3:System.out.println(number + " = THREE");break;
			case 4:System.out.println(number + " = FOUR");break;
			case 5:System.out.println(number + " = FIVE");break;
			case 6:System.out.println(number + " = SIX");break;
			case 7:System.out.println(number + " = SEVEN");break;
			case 8:System.out.println(number + " = EIGHT");break;
			case 9:System.out.println(number + " = NINE");break;
			default:System.out.println(number + " = OTHER");
			}
		}
	}
}