package arrays;

public class Array1 {

	public static void main(String[] args) {
		// declare of array
		int[] var=new int[6];
		
		var[0]=10;
		var[1]=30;
		var[2]=50;
		var[3]=70;
		var[4]=90;
		var[5]=110;
		
		System.out.println(var.length);
		// for each loop
		for(int i : var ) {
			System.out.println(i);
		}

	}

}
