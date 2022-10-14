package hellooo;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int x = 0; x < 100; x++) {
			int f = 0;
			if(x % 2 != 0) {
				for (int y = 1; y < x; y+=2) {
					if(x % y != 0) {
						f += 1;
					}
				}
				
			}
		}
	}
}