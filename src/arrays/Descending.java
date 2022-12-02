package arrays;

import java.util.Arrays;

public class Descending {

	public static void main(String[] args) {
		// sort array ascending
		int[] var = {100,20,50,40,45};
		
		Arrays.sort(var);
		
		for (int i=(var.length-1); i>=0; i--) {
			System.out.println(var[i]);
		}			
	}
}
