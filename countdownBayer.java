package exercises4;

public class countdownBayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int x = 10; x > 0; x--) {
			if (x == 10) {
				System.out.println("We are ready for launch in T minus 10...");
			}
			if (x == 8) {
				System.out.println("Ignition sequance start!");
			} if (x != 10 && x != 8) {
				System.out.println(x);
			}			
		}
		System.out.println("All engines running!\nLiftoff! We have a liftoff!");
	}
}