package arrays;

public class Array {

	public static void main(String[] args) {
		int x=20;
		int y=30;
		int z=40;
		
		// declear of array
		int[] var=new int[4];
		
		var[0]=10;
		var[1]=20;
		var[2]=30;
		var[3]=40;
		
		System.out.println(var.length);
		
		//for each loop
		for (int i:var) {
				System.out.println(i);
		}
	}

}
