package src;

public class BayerReverseArrayTest {
	public static void reverseArray(int[] intArray) {
		for(int x = 0; x < intArray.length/2; x++) {
			intArray[x] = intArray[intArray.length-x];
		}
		System.out.print(intArray);
	}
	public static void main(String[] args) {
		int arr[] = {1,5,3,3,6,3,6,2,634,7}; 
		System.out.print(arr);
	}

}
