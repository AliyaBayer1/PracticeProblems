package Chapter13;

import java.util.Scanner;

public class internetDelicatessenBayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String item;
		double price, overnight, shipping = 0, total = 0;
		Scanner scan = new Scanner( System.in );
		System.out.print("Enter the item: ");
	    item = scan.nextLine();
	    System.out.print("Enter the price: ");
	    price = scan.nextDouble();
	    System.out.print("Overnight delivery (0==no, 1==yes): ");
	    overnight = scan.nextDouble();
	    if (price >= 1000) {
	    	shipping = 3.00;
	    }
	    if (price < 1000) {
	    	shipping = 2.00;
	    }
	    if (overnight == 1) {
	    	shipping += 5;
	    }
	    price = price / 100;
	    total = price + shipping;
	    System.out.println("Invoice:");
	    System.out.println(item + "\t\t" + price);
	    System.out.println("shipping\t\t" + shipping);
	    System.out.println("total\t\t\t" + total);
	}

}
