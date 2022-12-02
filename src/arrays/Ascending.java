package arrays;

import java.util.Arrays;

public class Ascending {

	public static void main(String[] args) {
		
		int[] ref= {65,85,62,89,75};
		
		Arrays.sort(ref);
		
		for (int i:ref) {
			System.out.println(i);
		}

	}

}
