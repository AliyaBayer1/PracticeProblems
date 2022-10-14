package Chapter17;

public class pineTreeBayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stairs = 8, stars = 1;
		for (int x = 0; x < 8; x++) {
			stairs -=1;
			for (int y = 0; y < stairs; y++) {
				System.out.print(" ");
			}
			for (int y = 0; y < stars; y++) {
				System.out.print("*");
			}
			stars += 2;
			System.out.print("\n");
		}
		for (int z = 0; z < 3; z++) {
			for (int a = 0; a < 6; a++) {
				System.out.print(" ");
			}
			for (int b = 0; b < 3; b++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
