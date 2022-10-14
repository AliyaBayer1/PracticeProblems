package Chapter13;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
public class zeroOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] arrayOne = {0,0,0,1,1,1,1,1,1,0,0,1,0};
		String [] placeHolder = {};
		int ones = 0, rows= 0, plch=0, plcx;
		for (int x = 0; x < arrayOne.length-1; x++) {
			
			if (arrayOne[x] == 0) {
				ones = 0;
			}

			if (arrayOne[x] == 1) {
				ones += 1;
			}
			
			
			if (ones == 5) {
				rows += 1;
				for (int a = 0; a < x; a++) {
					arrayOne[a] = Integer.parseInt(placeHolder[a]);
					
				}
				System.out.println(Arrays.toString(placeHolder));
			}
				for (int a = 0; a < x; a++) {
					//placeHolder[a] = arrayOne[a+rows];
				}
		
		System.out.println(ones);
		}
	}
}
