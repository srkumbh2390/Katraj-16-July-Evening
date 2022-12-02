package arrays;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
		
		String [] ref = new String [4];
		
		ref[0] = "Swapnil";
		ref[1]="Pradnya";
		ref[2]="Nitesh";
		ref[3]="Bhupendra";
		
		String [] ref1 = {"Pune", "Mumbai", "Nagpur", "Thane"};
		
		System.out.println(ref.length);
		Arrays.sort(ref1);			// for ascending order
		
		for (String s : ref) {
			System.out.println(s);
		}
 	}

}
