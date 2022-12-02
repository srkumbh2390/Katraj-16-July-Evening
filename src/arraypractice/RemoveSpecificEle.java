package arraypractice;

import java.util.Arrays;

public class RemoveSpecificEle {

	public static void main(String[] args) {
	
		int [] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		System.out.println("Original Array : "+ Arrays.toString(my_array));
		
		int removeindex = 4;
		
		for (int i = removeindex; i<my_array.length-1; i++) {
				my_array[i]=my_array[i+1];
				
				
		}
		System.out.println("After romoving second element : " + Arrays.toString(my_array));
	}

}
