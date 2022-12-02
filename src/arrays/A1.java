package arrays;

public class A1 {

	public static void main(String[] args) {
		
		int x = 170;
		int y=150;
		int z=200;
		
		int [] var = new int [4];
		
		var[0]=170;
		var[1]=150;
		var[2]=200;
		var[3]=250;
	
	
		System.out.println(var.length);	
		for (int i : var) {
			System.out.println(i);
		}
	}
}
